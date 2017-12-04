package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Accidentalidad;


public interface IAccidentalidadDao extends PagingAndSortingRepository<Accidentalidad, Long>{
	
}
