package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;


public interface IVehiculoDao {

	public List<Vehiculo> findAll();
	
	public void save (Vehiculo vehiculo);
	
	public Vehiculo findOne(Long id);
	
}
