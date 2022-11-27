package com.crud1local.app.service;

import java.util.List;


import com.crud1local.app.entity.Equipo;

public interface IEquipoService {
	public List<Equipo> findAll();
	public void save(Equipo equipo);
	public void delete(Long id);
	public Equipo findone(Long id);

}
