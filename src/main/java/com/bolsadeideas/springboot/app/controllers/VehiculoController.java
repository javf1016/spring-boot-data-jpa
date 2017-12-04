package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

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

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;
import com.bolsadeideas.springboot.app.models.service.IVehiculoService;


@Controller
@SessionAttributes("vehiculo")
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;

	@RequestMapping(value = "listarVehiculo", method = RequestMethod.GET)
	public String listar(Model model) {

		model.addAttribute("titulo", "listado de vehiculos");
		model.addAttribute("vehiculos", vehiculoService.findAll());
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
	public String editar(@PathVariable (value="id") Long idVehiculo, Map<String, Object> model) {

		Vehiculo vehiculo = null;
		if(idVehiculo>0) {
			vehiculo=vehiculoService.findOne(idVehiculo);
		}
		else {
			return "redirect:listarVehiculo";
		}
		model.put("vehiculo", vehiculo);
		model.put("titulo", "Editar Vehiculo");
		System.out.println("el soat es "+vehiculo.getIdSoat().getNumeroPolizaSoat());
		System.out.println("el tarjeta operacion es "+vehiculo.getIdTarjetaOperacion().getNumeroTarjetaOperacion());
		return "formVehiculo";

	}
	

	@RequestMapping(value = "/formVehiculo", method = RequestMethod.POST)
	public String guardar(@Valid Vehiculo vehiculo, BindingResult result, Model model, SessionStatus status) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Vehiculo");
			System.out.println("esta error");
			return "formVehiculo";
		}
		vehiculoService.save(vehiculo);
		System.out.println("esta editadno");
		status.setComplete();
		return "redirect:listarVehiculo";

	}
}
