package com.crud1local.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.crud1local.app.entity.Equipo;
import com.crud1local.app.entity.Evento;





public interface IEventoepository extends CrudRepository<Evento, Long> {

	
	
}