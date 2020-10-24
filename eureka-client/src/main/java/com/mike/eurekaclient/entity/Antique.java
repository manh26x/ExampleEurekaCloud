package com.mike.eurekaclient.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Antique implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1110688451405406783L;
	
	@Id
	private int id;
	private String name;
	private String formDate;
	private byte[] image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormDate() {
		return formDate;
	}
	public void setFormDate(String formDate) {
		this.formDate = formDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	

	
}
