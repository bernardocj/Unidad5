package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Computer;
import mx.utng.practice.repository.ComputerRepository;



@Named
@ViewScoped
public class ComputerController {

	@Autowired
	private ComputerRepository computerRepository;
	private Computer computer=new Computer();
	private List<Computer>computers;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setComputers(computerRepository.findAll());
	}

	public void save(){
		computerRepository.save(computer);
		if(!editMode){
			getComputers().add(computer);
		}
		computer=new Computer();
		setEditMode(false);
	}
	
	public void delete(Computer computer){
		computerRepository.delete(computer);
		computers.remove(computer);
	}
	public void update(Computer computer){
		setComputer(computer);
		setEditMode(true);
	}
	public void cancel(){
		computer =new Computer();
		setEditMode(false);
	}
	
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public List<Computer> getComputers() {
		return computers;
	}

	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
