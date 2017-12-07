package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IVehiculoDao;
import com.bolsadeideas.springboot.app.models.entity.Vehiculo;


@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Vehiculo vehiculo) {
		vehiculoDao.save(vehiculo);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Vehiculo findOne(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findOne(id);
	}
	
	@Override
	public Page<Vehiculo> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return vehiculoDao.findAll(pageable);
	}

}
