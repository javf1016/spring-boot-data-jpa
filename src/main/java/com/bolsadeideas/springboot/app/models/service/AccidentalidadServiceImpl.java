package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IAccidentalidadDao;
import com.bolsadeideas.springboot.app.models.entity.Accidentalidad;

@Service
public class AccidentalidadServiceImpl implements IAccidentalidadService{

	@Autowired
	private IAccidentalidadDao accidentalidadDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Accidentalidad> findAll() {
		// TODO Auto-generated method stub
		return (List<Accidentalidad>) accidentalidadDao.findAll();
	}

	@Override
	@Transactional
	public void save(Accidentalidad accidentalidad) {
		accidentalidadDao.save(accidentalidad);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Accidentalidad findOne(Long id) {
		// TODO Auto-generated method stub
		return accidentalidadDao.findOne(id);
	}

	@Override
	public Page<Accidentalidad> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return accidentalidadDao.findAll(pageable);
	}

}
