package com.mike.eurekaclient.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Archaeologist implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2203140740007393423L;
	private String name;
	private String birthDay;
	private String bachelor;
	@Id
	private int id;
	
	@ManyToOne
	private Antique unearthAntique;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getBachelor() {
		return bachelor;
	}
	public void setBachelor(String bachelor) {
		this.bachelor = bachelor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Antique getUnearthAntique() {
		return unearthAntique;
	}
	public void setUnearthAntique(Antique unearthAntique) {
		this.unearthAntique = unearthAntique;
	}
	
	
	
	

}
