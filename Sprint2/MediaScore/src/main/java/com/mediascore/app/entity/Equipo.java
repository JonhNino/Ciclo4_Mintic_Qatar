package com.mediascore.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="equipo")
public class Equipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String pais;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
