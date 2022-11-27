package com.crud1local.app.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="evento")
public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Column(length = 50)
	private String equipo1;
	@NotEmpty
	@Column(length = 50)
	private String equipo2;
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
//	@ManyToMany(fetch =FetchType.LAZY)
//	private List<Equipo>equipo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//	public List<Equipo> getEquipo() {
//		return equipo;
//	}
//	public void setEquipo(List<Equipo> equipo) {
//		this.equipo = equipo;
//	}
//	

}
