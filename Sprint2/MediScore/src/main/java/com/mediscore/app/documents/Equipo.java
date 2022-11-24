package com.mediscore.app.documents;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Equipo")
public class Equipo implements Serializable{

//Serial
private static final long serialVersionUID = 1L;

//Campos
@Id
@NotNull
private Long id;
	
@Field
@NotEmpty
private String nombre;	
	
@Field
@NotEmpty
private String pais;
	
//Un Equipo puede tener muchos eventos ManyToMany
private List<Evento> evento_id;



//Constructor
public Equipo(@NotNull Long id, @NotEmpty String nombre, @NotEmpty String pais, List<Evento> evento_id) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.pais = pais;
	this.evento_id = evento_id;
}


//Empty Contructor
public Equipo() {
	super();
}


//Getter And Setter
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPais() {
	return pais;
}

public void setPais(String pais) {
	this.pais = pais;
}

public List<Evento> getEvento_id() {
	return evento_id;
}

public void setEvento_id(List<Evento> evento_id) {
	this.evento_id = evento_id;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


}
