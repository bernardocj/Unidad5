package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="document_type")
public class DocumentType {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String name;
	@Column(name="file_extension", length=10)
	private String fileExtension;
	
	public DocumentType(String name, String fileExtension) {
		super();
		this.name = name;
		this.fileExtension = fileExtension;
		
	}
	public DocumentType() {
		this("","");
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
	
	
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", model=" + fileExtension + "]";
	}
	
	
	
}
