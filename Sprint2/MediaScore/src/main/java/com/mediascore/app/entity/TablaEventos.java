package com.mediascore.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tablaeventos")
public class TablaEventos implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String usuario;
	private String equipo1;
	private String golesequipo1;
	private String equipo2;
	private String golesequipo2;
	private Date fecha;
	@OneToMany(fetch =FetchType.EAGER)
	@JoinColumn(name ="id_evento")
	private List<Evento>evento;	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getGolesequipo1() {
		return golesequipo1;
	}
	public void setGolesequipo1(String golesequipo1) {
		this.golesequipo1 = golesequipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public String getGolesequipo2() {
		return golesequipo2;
	}
	public void setGolesequipo2(String golesequipo2) {
		this.golesequipo2 = golesequipo2;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
