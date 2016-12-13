package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="movies")
public class Movie {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=70)
	private String year;
	@Column
	private int sales;
	@Column(length=70)
	private String description;
	public Movie(String name, String year, int sales, String description) {
		super();
		this.name = name;
		this.year = year;
		this.sales = sales;
		this.description=description;
	}
	public Movie() {
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", year=" + year + ", sales=" + sales +", description=" +description+"]";
	}
	
	
	
}
