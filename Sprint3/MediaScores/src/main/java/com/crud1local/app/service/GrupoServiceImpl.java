package com.crud1local.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud1local.app.entity.Grupo;
import com.crud1local.app.repository.IGrupoepository;
@Service
public class GrupoServiceImpl implements IGrupoService {
	
	@Autowired
	private IGrupoepository grupoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Grupo> findAll() {
		
		return (List <Grupo>) grupoDao.findAll();
	}

	@Override
	public void save(Grupo grupo) {
		grupoDao.save(grupo);		
	}

	@Override
	public void delete(Long id) {
		grupoDao.deleteById(id);	
		
	}

	@Override
	@Transactional(readOnly =true)
	public Grupo findone(Long id) {
		return grupoDao.findById(id).orElse(null);
		
	}

}
