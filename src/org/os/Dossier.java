package org.os;

import java.io.Serializable;

public class Dossier implements Serializable {

	private static final long serialVersionUID = -6194957405780767257L;
	
	private int id;
	private String title;
	private String description;

	public Dossier() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
