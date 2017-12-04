package com.bolsadeideas.springboot.app.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="polizaResponsabilidadCiviles")
public class PolizaResponsabilidadCivil {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_poliza_responsabilidad_civil")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPolizaResponsabilidadCivil;
	
	@Column(name="numero_poliza_responsabilidad_civil")
	private int numeroPolizaResponsabilidadCivil;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_poliza_responsabilidad_civil")
	private Date fechaExpedicionPolizaResponsabilidadCivil;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_poliza_responsabilidad_civil")
	private Date fechaVencimientoPolizaResponsabilidadCivil;
	
	@Column(name="aviso_vencimiento_poliza_responsabilidad_civil")
	private int avisoVencimientoPolizaResponsabilidadCivil;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdPolizaResponsabilidadCivil() {
		return idPolizaResponsabilidadCivil;
	}

	public void setIdPolizaResponsabilidadCivil(Long idPolizaResponsabilidadCivil) {
		this.idPolizaResponsabilidadCivil = idPolizaResponsabilidadCivil;
	}

	public int getNumeroPolizaResponsabilidadCivil() {
		return numeroPolizaResponsabilidadCivil;
	}

	public void setNumeroPolizaResponsabilidadCivil(int numeroPolizaResponsabilidadCivil) {
		this.numeroPolizaResponsabilidadCivil = numeroPolizaResponsabilidadCivil;
	}

	public Date getFechaExpedicionPolizaResponsabilidadCivil() {
		return fechaExpedicionPolizaResponsabilidadCivil;
	}

	public void setFechaExpedicionPolizaResponsabilidadCivil(Date fechaExpedicionPolizaResponsabilidadCivil) {
		this.fechaExpedicionPolizaResponsabilidadCivil = fechaExpedicionPolizaResponsabilidadCivil;
	}

	public Date getFechaVencimientoPolizaResponsabilidadCivil() {
		return fechaVencimientoPolizaResponsabilidadCivil;
	}

	public void setFechaVencimientoPolizaResponsabilidadCivil(Date fechaVencimientoPolizaResponsabilidadCivil) {
		this.fechaVencimientoPolizaResponsabilidadCivil = fechaVencimientoPolizaResponsabilidadCivil;
	}

	public int getAvisoVencimientoPolizaResponsabilidadCivil() {
		return avisoVencimientoPolizaResponsabilidadCivil;
	}

	public void setAvisoVencimientoPolizaResponsabilidadCivil(int avisoVencimientoPolizaResponsabilidadCivil) {
		this.avisoVencimientoPolizaResponsabilidadCivil = avisoVencimientoPolizaResponsabilidadCivil;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
