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

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;
import com.bolsadeideas.springboot.app.models.service.IVehiculoService;
import com.bolsadeideas.springboot.app.util.paginator.PageRender;


@Controller
@SessionAttributes("vehiculo")
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;

	@RequestMapping(value = "listarVehiculo", method = RequestMethod.GET)
	public String listar(@RequestParam(name="page", defaultValue="0") int page, Model model) {

		Pageable pageRequest = new PageRequest(page, 4);

		Page<Vehiculo> vehiculos = vehiculoService.findAll(pageRequest);
		PageRender<Vehiculo> pageRender = new PageRender<Vehiculo>("/listarAccidentalidad", vehiculos);
		model.addAttribute("titulo", "Listado de Vehículos");
		model.addAttribute("vehiculos", vehiculoService.findAll());
		model.addAttribute("page", pageRender);
		return "listarVehiculo";
		
	}
	
	@RequestMapping(value="/formVehiculo")
	public String crear(Map<String, Object> model) {
		
		Vehiculo vehiculo = new Vehiculo();
		model.put("vehiculo", vehiculo);
		model.put("titulo", "Formulario de Vehiculo");
		return "formVehiculo";
		
	}
	
	@RequestMapping(value = "/formVehiculo/{id}")
	public String editar(@PathVariable (value="id") Long idVehiculo, Map<String, Object> model, RedirectAttributes flash) {

		Vehiculo vehiculo = null;
		if(idVehiculo>0) {
			vehiculo=vehiculoService.findOne(idVehiculo);
			if(vehiculo == null) {
				flash.addFlashAttribute("error", "El ID del vehiculo no existe en la BBDD!");
				return "redirect:/listarVehiculo";
			}
		}
		else {
			flash.addFlashAttribute("error", "El ID del vehiculo no puede ser cero!");
			return "redirect:listarVehiculo";
		}
		model.put("vehiculo", vehiculo);
		model.put("titulo", "Editar Vehiculo");
		return "formVehiculo";

	}
	

	@RequestMapping(value = "/formVehiculo", method = RequestMethod.POST)
	public String guardar(@Valid Vehiculo vehiculo, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Vehiculo");
			return "formVehiculo";
		}
		String mensajeFlash = (vehiculo.getIdVehiculo() != null)? "Vehiculo editado con éxito!" : "Vehiculo creado con éxito!";
		vehiculoService.save(vehiculo);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		return "redirect:listarVehiculo";

	}
}
