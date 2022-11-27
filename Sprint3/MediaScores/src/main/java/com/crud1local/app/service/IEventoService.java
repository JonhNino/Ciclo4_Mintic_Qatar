package com.crud1local.app.service;

import java.util.List;


import com.crud1local.app.entity.Equipo;
import com.crud1local.app.entity.Evento;

public interface IEventoService {
	public List<Evento> findAll();
	public void save(Evento evento);
	public void delete(Long id);
	public Evento findone(Long id);

}
