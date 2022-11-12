package com.mediascore.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="evento")
public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String equipo1;
	private String equipo2;
	private Date fecha;
	@ManyToMany(fetch =FetchType.LAZY)
	private List<Equipo>equipo;
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
	public List<Equipo> getEquipo() {
		return equipo;
	}
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}
	

}
