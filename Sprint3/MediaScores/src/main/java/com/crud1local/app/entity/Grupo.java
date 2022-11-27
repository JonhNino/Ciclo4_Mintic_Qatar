package com.crud1local.app.entity;


import java.io.Serializable;
import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name ="grupo")
public class Grupo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(length = 100)
	private String grupo;
	@NotEmpty
	@Column(length = 100)
	private String equipof;
//	@OneToMany(fetch =FetchType.EAGER)
//	@JoinColumn(name ="id_equipo")
//	private List<Equipo>equipo;	
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
