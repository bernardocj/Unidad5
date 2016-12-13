package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="products")
public class Product {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(length=70)
	private String price;
	@Column
	private int stock;
	@Column(length=70)
	private String description;
	public Product(String name, String price, int stock, String description) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.description=description;
	}
	public Product() {
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock +", description=" +description+"]";
	}
	
	
	
}
