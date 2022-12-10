package com.crud1local.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud1local.app.entity.Equipo;
import com.crud1local.app.repository.IEquipoepository;
@Service
public class EquipoServiceImpl implements IEquipoService {
	
	@Autowired
	private IEquipoepository equipoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Equipo> findAll() {
		
		return (List <Equipo>) equipoDao.findAll();
	}

	@Override
	public void save(Equipo equipo) {
		equipoDao.save(equipo);		
	}

	@Override
	public void delete(Long id) {
		equipoDao.deleteById(id);	
		
	}

	@Override
	@Transactional(readOnly =true)
	public Equipo findone(Long id) {
		return equipoDao.findById(id).orElse(null);
		
	}

}
