package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Movie;
import mx.utng.practice.repository.MovieRepository;



@Named
@ViewScoped
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	private Movie movie=new Movie();
	private List<Movie>movies;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setMovies(movieRepository.findAll());
	}

	public void save(){
		movieRepository.save(movie);
		if(!editMode){
			getMovies().add(movie);
		}
		movie=new Movie();
		setEditMode(false);
	}
	
	public void delete(Movie movie){
		movieRepository.delete(movie);
		movies.remove(movie);
	}
	public void update(Movie movie){
		setMovie(movie);
		setEditMode(true);
	}
	public void cancel(){
		movie =new Movie();
		setEditMode(false);
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
