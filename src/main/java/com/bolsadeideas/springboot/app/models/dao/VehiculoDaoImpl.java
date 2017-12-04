package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Vehiculo;

@Repository("vehiculoDaoJPA")
public class VehiculoDaoImpl implements IVehiculoDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> findAll() {
		return em.createQuery("FROM Vehiculo").getResultList();
	}

	@Override
	public void save(Vehiculo vehiculo) {
		if(vehiculo.getIdVehiculo()!=null && vehiculo.getIdVehiculo()>0) {
			em.merge(vehiculo);
			
		}
		else {
			em.persist(vehiculo);
		}
		
	}

	@Override
	public Vehiculo findOne(Long id) {
		return em.find(Vehiculo.class, id);
	}

}
