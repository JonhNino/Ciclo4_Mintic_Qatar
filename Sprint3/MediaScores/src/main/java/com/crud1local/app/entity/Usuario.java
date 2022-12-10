package com.crud1local.app.entity;


import java.io.Serializable;
import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name ="usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String name;
	private String password;
//	@ManyToMany(fetch =FetchType.LAZY)
//	private List<Evento>evento;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//	public List<Evento> getEvento() {
//		return evento;
//	}
//	public void setEvento(List<Evento> evento) {
//		this.evento = evento;
//	}
	
	
	

}