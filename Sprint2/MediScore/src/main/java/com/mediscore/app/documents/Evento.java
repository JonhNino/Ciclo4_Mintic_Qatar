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

@Document(collection = "Evento")
public class Evento implements Serializable{

//Serial
private static final long serialVersionUID = 1L;
//End Serial

//Campos
@Id
@NotNull
private Long id;
	
@Field
@NotEmpty
private String equipo1;
	
@Field
@NotEmpty
private String equipo2;
	
@Field
@NotNull
@DateTimeFormat(pattern = "yyyy-mm-dd")
private Date fecha;

//Un evento puede tener muchos equipos ManyToMany
private List<Equipo> equipo_id;



//Constructor
public Evento(@NotNull Long id, @NotEmpty String equipo1, @NotEmpty String equipo2, @NotNull Date fecha,
		List<Equipo> equipo_id) {
	super();
	this.id = id;
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.fecha = fecha;
	this.equipo_id = equipo_id;
}


//Empty Contructor
public Evento() {
	super();
}

//Getter And Setter
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

public List<Equipo> getEquipo_id() {
	return equipo_id;
}

public void setEquipo_id(List<Equipo> equipo_id) {
	this.equipo_id = equipo_id;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}



}

