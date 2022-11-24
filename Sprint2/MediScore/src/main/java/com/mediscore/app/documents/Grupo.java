package com.mediscore.app.documents;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Grupo")
public class Grupo implements Serializable{

//Serial
private static final long serialVersionUID = 1L;

//Campos
@Id
@NotNull
private Long id;

@Field
@NotEmpty
private String grupo;

@Field
@NotEmpty
private String equipo_grupo;

//Un grupo puede tener muchos equipos
private List<Equipo>equipo;



//Constructor
public Grupo(@NotNull Long id, @NotEmpty String grupo, @NotEmpty String equipo_grupo, List<Equipo> equipo) {
	super();
	this.id = id;
	this.grupo = grupo;
	this.equipo_grupo = equipo_grupo;
	this.equipo = equipo;
}


//Empty Contructor
public Grupo() {
	super();
}

//Getter And Setter
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

public String getEquipo_grupo() {
	return equipo_grupo;
}

public void setEquipo_grupo(String equipo_grupo) {
	this.equipo_grupo = equipo_grupo;
}

public List<Equipo> getEquipo() {
	return equipo;
}

public void setEquipo(List<Equipo> equipo) {
	this.equipo = equipo;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


}

