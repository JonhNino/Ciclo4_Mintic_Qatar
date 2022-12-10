package com.crud1local.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud1local.app.entity.Evento;
import com.crud1local.app.repository.IEventoepository;
@Service
public class EventoServiceImpl implements IEventoService {
	
	@Autowired
	private IEventoepository eventoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Evento> findAll() {
		
		return (List <Evento>) eventoDao.findAll();
	}

	@Override
	public void save(Evento evento) {
		eventoDao.save(evento);		
	}

	@Override
	public void delete(Long id) {
		eventoDao.deleteById(id);	
		
	}

	@Override
	@Transactional(readOnly =true)
	public Evento findone(Long id) {
		return eventoDao.findById(id).orElse(null);
		
	}

}
