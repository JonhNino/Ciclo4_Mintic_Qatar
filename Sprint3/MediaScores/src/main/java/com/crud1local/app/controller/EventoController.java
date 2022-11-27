package com.crud1local.app.controller;

import java.util.Map;
import java.util.Optional;

import javax.naming.spi.DirStateFactory.Result;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.crud1local.app.entity.Evento;
import com.crud1local.app.service.IEventoService;






@Controller
@SessionAttributes("evento")
public class EventoController {
	
	@Autowired
	private IEventoService eventoDao;
	
	
	@RequestMapping(value="/listarevento",method = RequestMethod.GET)
	public String llamarListar(Model model)
	{
		model.addAttribute("evento",eventoDao.findAll());
		return "listarevento";
	}
	
	
	
	@RequestMapping(value={"/formevento"},method = RequestMethod.GET)
	public String llamarformulario(Map<String,Object> model)
	{
		Evento evento = new Evento();
		model.put("evento", evento);
		return "formevento";
	}
	
	
	
	@RequestMapping(value={"/formevento"},method = RequestMethod.POST)
	public String guardar(@Valid Evento evento, BindingResult result, SessionStatus status)
	{
		if(result.hasErrors()) {
			return "formevento";
		}
		eventoDao.save(evento);
		return "redirect:listarevento";
	}

	
	
	@RequestMapping(value={"/eliminarevento/{id}"})
	public String eliminar (@PathVariable(value="id") Long id)
	{
		if (id > 0) {
			eventoDao.delete(id);
		}
		return "redirect:/listarevento";
	}
	
	
	@RequestMapping(value={"/formevento/{id}"})
	public String editar (@PathVariable(value="id") Long id, Map<String,Object> model)
	{
		Evento evento=null;
		if (id > 0) {
			evento = eventoDao.findone(id);
			
			} else {
				return "redirect:listarevento";
			}
		    model.put("evento", evento);
			return "formevento";
		}
		
}
