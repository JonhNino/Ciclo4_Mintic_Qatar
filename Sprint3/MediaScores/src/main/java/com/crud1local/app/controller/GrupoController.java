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

import com.crud1local.app.entity.Grupo;
import com.crud1local.app.service.IGrupoService;






@Controller
@SessionAttributes("grupo")
public class GrupoController {
	
	@Autowired
	private IGrupoService grupoDao;
	
	
	@RequestMapping(value="/listargrupo",method = RequestMethod.GET)
	public String llamarListar(Model model)
	{
		model.addAttribute("grupo",grupoDao.findAll());
		return "listargrupo";
	}
	
	
	
	@RequestMapping(value={"/formgrupo"},method = RequestMethod.GET)
	public String llamarformulario(Map<String,Object> model)
	{
		Grupo grupo = new Grupo();
		model.put("grupo", grupo);
		return "formgrupo";
	}
	
	
	
	@RequestMapping(value={"/formgrupo"},method = RequestMethod.POST)
	public String guardar(@Valid Grupo grupo, BindingResult result, SessionStatus status)
	{
		if(result.hasErrors()) {
			return "formgrupo";
		}
		grupoDao.save(grupo);
		return "redirect:listargrupo";
	}

	
	
	@RequestMapping(value={"/eliminargrupo/{id}"})
	public String eliminar (@PathVariable(value="id") Long id)
	{
		if (id > 0) {
			grupoDao.delete(id);
		}
		return "redirect:/listargrupo";
	}
	
	
	@RequestMapping(value={"/formgrupo/{id}"})
	public String editar (@PathVariable(value="id") Long id, Map<String,Object> model)
	{
		Grupo grupo=null;
		if (id > 0) {
			grupo = grupoDao.findone(id);
			
			} else {
				return "redirect:listargrupo";
			}
		    model.put("grupo", grupo);
			return "formgrupo";
		}
		
}
