package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bolsadeideas.springboot.app.models.entity.Accidentalidad;
import com.bolsadeideas.springboot.app.models.service.IAccidentalidadService;
import com.bolsadeideas.springboot.app.util.paginator.PageRender;


@Controller
@SessionAttributes("accidentalidad")
public class AccidentalidadController {

	@Autowired
	private IAccidentalidadService accidentalidadService;

	@RequestMapping(value = "listarAccidentalidad", method = RequestMethod.GET)
	public String listar(@RequestParam(name="page", defaultValue="0") int page, Model model) {
		
		Pageable pageRequest = new PageRequest(page, 4);

		Page<Accidentalidad> accidentalidades = accidentalidadService.findAll(pageRequest);
		PageRender<Accidentalidad> pageRender = new PageRender<Accidentalidad>("/listarAccidentalidad", accidentalidades);
		model.addAttribute("titulo", "Listado de Accidentalidad");
		model.addAttribute("accidentalidades", accidentalidadService.findAll());
		model.addAttribute("page", pageRender);
		return "listarAccidentalidad";
		
	}
	
	@RequestMapping(value="/formAccidentalidadInterno")
	public String crear(Map<String, Object> model) {
		
		Accidentalidad accidentalidad = new Accidentalidad();
		model.put("accidentalidad", accidentalidad);
		model.put("titulo", "Formulario de Accidentalidad");
		return "formAccidentalidadInterno";
		
	}
	
	@RequestMapping(value = "/formAccidentalidadInterno/{id}")
	public String editar(@PathVariable (value="id") Long id, Map<String, Object> model, RedirectAttributes flash) {

		Accidentalidad accidentalidad = null;
		if(id>0) {
			accidentalidad=accidentalidadService.findOne(id);
			if(accidentalidad == null) {
				flash.addFlashAttribute("error", "El ID del accidente no existe en la BBDD!");
				return "redirect:/listarAccidentalidad";
			}
		}
		else {
			flash.addFlashAttribute("error", "El ID del accidente no puede ser cero!");
			return "redirect:listarAccidentalidad";
		}
		model.put("accidentalidad", accidentalidad);
		model.put("titulo", "Editar Accidentalidad");
		return "formAccidentalidadInterno";

	}
	

	@RequestMapping(value = "/formAccidentalidadInterno", method = RequestMethod.POST)
	public String guardar(@Valid Accidentalidad accidentalidad, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Accidentalidad");
			return "formAccidentalidadInterno";
		}
		String mensajeFlash = (accidentalidad.getId() != null)? "Informe editado con éxito!" : "Informe creado con éxito!";
		accidentalidadService.save(accidentalidad);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		return "redirect:listarAccidentalidad";

	}
}
