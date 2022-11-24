package com.mediscore.app.documents;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Usuario")
public class Usuario implements Serializable{

//Serial
private static final long serialVersionUID = 1L;
//End Serial

//Campos
@Id
@NotNull
private Long id;

@Field
@NotEmpty
private String username;

@Field
@NotEmpty
private String password;

//Un usuario puede tener muchos eventos
private List<Evento> evento_id;


//Constructor
public Usuario(@NotNull Long id, @NotEmpty String username, @NotEmpty String password, List<Evento> evento_id) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.evento_id = evento_id;
}


//Empty Contructor
public Usuario() {
	super();
}


//Getter And Setter
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

