package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

	@Query("select movi from Movie movi")
	public List<Movie> findAll();
	
}
