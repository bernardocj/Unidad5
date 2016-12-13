package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.DocumentType;
import mx.utng.practice.repository.DocumentTypeRepository;



@Named
@ViewScoped
public class DocumentTypeController {

	@Autowired
	private DocumentTypeRepository documentTypeRepository;
	private DocumentType documentType=new DocumentType();
	private List<DocumentType>documentTypes;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setDocumentTypes(documentTypeRepository.findAll());
	}

	public void save(){
		documentTypeRepository.save(documentType);
		if(!editMode){
			getDocumentTypes().add(documentType);
		}
		documentType=new DocumentType();
		setEditMode(false);
	}
	
	public void delete(DocumentType documentType){
		documentTypeRepository.delete(documentType);
		documentTypes.remove(documentType);
	}
	public void update(DocumentType documentType){
		setDocumentType(documentType);
		setEditMode(true);
	}
	public void cancel(){
		documentType =new DocumentType();
		setEditMode(false);
	}
	
	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public List<DocumentType> getDocumentTypes() {
		return documentTypes;
	}

	public void setDocumentTypes(List<DocumentType> documentTypes) {
		this.documentTypes = documentTypes;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
}
