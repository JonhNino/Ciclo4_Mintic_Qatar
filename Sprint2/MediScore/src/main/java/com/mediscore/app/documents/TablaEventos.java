package com.mediscore.app.documents;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

@Document (collection = "TablaEventos")
public class TablaEventos implements Serializable{

//Serial
private static final long serialVersionUID = 1L;

//Campos
@Id
@NotNull
private Long id;
	
@Field
@NotEmpty
private String usuario;
	
@Field
@NotEmpty
private String equipo1;
	
@Field
@NotEmpty
private String equipo2;
	
@Field
@NotEmpty
private String golesequipo1;

@Field
@NotEmpty
private String golesequipo2;
	
@Field
@NotNull
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date fecha;

//Tabla Eventos tiene muchos eventos.
private List<Evento> evento;

//Constructor
public TablaEventos(@NotNull Long id, @NotEmpty String usuario, @NotEmpty String equipo1, @NotEmpty String equipo2,
		@NotEmpty String golesequipo1, @NotEmpty String golesequipo2, @NotNull Date fecha, List<Evento> evento) {
	super();
	this.id = id;
	this.usuario = usuario;
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.golesequipo1 = golesequipo1;
	this.golesequipo2 = golesequipo2;
	this.fecha = fecha;
	this.evento = evento;
}


//Empty Contructor
public TablaEventos() {
	super();
}


//Getter And Setter
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

public String getEquipo2() {
	return equipo2;
}

public void setEquipo2(String equipo2) {
	this.equipo2 = equipo2;
}

public String getGolesequipo1() {
	return golesequipo1;
}

public void setGolesequipo1(String golesequipo1) {
	this.golesequipo1 = golesequipo1;
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

public List<Evento> getEvento() {
	return evento;
}

public void setEvento(List<Evento> evento) {
	this.evento = evento;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


}

