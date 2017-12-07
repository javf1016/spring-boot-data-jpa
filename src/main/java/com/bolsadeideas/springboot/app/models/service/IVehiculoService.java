package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;


public interface IVehiculoService {
	
	public List<Vehiculo> findAll();
	
	public Page<Vehiculo> findAll(Pageable pageable);

	public void save(Vehiculo vehiculo);
	
	public Vehiculo findOne(Long id);

}
