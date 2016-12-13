package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="computers")
public class Computer {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=70)
	private String model;
	@Column
	private int ram;
	@Column(length=70)
	private String procesator;
	public Computer(String name, String model, int ram, String procesator) {
		super();
		this.name = name;
		this.model = model;
		this.ram = ram;
		this.procesator=procesator;
	}
	public Computer() {
		this("","",0,"");
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcesator() {
		return procesator;
	}
	public void setProcesator(String procesator) {
		this.procesator = procesator;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", model=" + model + ", ram=" + ram +", procesator=" +procesator+"]";
	}
	
	
	
}
