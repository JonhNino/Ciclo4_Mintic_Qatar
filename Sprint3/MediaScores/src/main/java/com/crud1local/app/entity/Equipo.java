package com.crud1local.app.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name ="equipo")
public class Equipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(length = 100)
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
