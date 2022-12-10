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

import com.crud1local.app.entity.Equipo;
import com.crud1local.app.service.IEquipoService;






@Controller
@SessionAttributes("equipo")
public class EquipoController {
	
	@Autowired
	private IEquipoService equipoDao;
	
	
	@RequestMapping(value="/listarequipo",method = RequestMethod.GET)
	public String llamarListar(Model model)
	{
		model.addAttribute("equipo",equipoDao.findAll());
		return "listarequipo";
	}
	
	
	
	@RequestMapping(value={"/formequipo","/"},method = RequestMethod.GET)
	public String llamarformulario(Map<String,Object> model)
	{
		Equipo equipo = new Equipo();
		model.put("equipo", equipo);
		return "formequipo";
	}
	
	
	
	@RequestMapping(value={"/formequipo"},method = RequestMethod.POST)
	public String guardar(@Valid Equipo equipo, BindingResult result, SessionStatus status)
	{
		if(result.hasErrors()) {
			return "formequipo";
		}
		equipoDao.save(equipo);
		return "redirect:listarequipo";
	}

	
	
	@RequestMapping(value={"/eliminarequipo/{id}"})
	public String eliminar (@PathVariable(value="id") Long id)
	{
		if (id > 0) {
			equipoDao.delete(id);
		}
		return "redirect:/listarequipo";
	}
	
	
	@RequestMapping(value={"/formequipo/{id}"})
	public String editar (@PathVariable(value="id") Long id, Map<String,Object> model)
	{
		Equipo equipo=null;
		if (id > 0) {
			equipo = equipoDao.findone(id);
			
			} else {
				return "redirect:listarequipo";
			}
		    model.put("equipo", equipo);
			return "formequipo";
		}
		
}
