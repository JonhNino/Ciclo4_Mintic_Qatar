package com.crud1local.app.service;

import java.util.List;


import com.crud1local.app.entity.Equipo;
import com.crud1local.app.entity.Grupo;

public interface IGrupoService {
	public List<Grupo> findAll();
	public void save(Grupo grupo);
	public void delete(Long id);
	public Grupo findone(Long id);

}
