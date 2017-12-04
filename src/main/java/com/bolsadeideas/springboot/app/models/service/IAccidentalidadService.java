package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Accidentalidad;

public interface IAccidentalidadService {

	public List<Accidentalidad> findAll();
	
	public Page<Accidentalidad> findAll(Pageable pageable);

	public void save(Accidentalidad accidentalidad);
	
	public Accidentalidad findOne(Long id);
	

}
