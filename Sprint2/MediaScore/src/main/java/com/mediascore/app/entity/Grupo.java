package com.mediascore.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;




@Entity
@Table(name ="grupo")
public class Grupo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String grupo;
	private String equipof;
	@OneToMany(fetch =FetchType.EAGER)
	@JoinColumn(name ="id_equipo")
	private List<Equipo>equipo;	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEquipof() {
		return equipof;
	}
	public void setEquipof(String equipof) {
		this.equipof = equipof;
	}
	

}
