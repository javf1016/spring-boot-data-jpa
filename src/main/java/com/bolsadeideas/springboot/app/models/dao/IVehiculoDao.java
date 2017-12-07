package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;


public interface IVehiculoDao  extends PagingAndSortingRepository<Vehiculo, Long>{
	
}
