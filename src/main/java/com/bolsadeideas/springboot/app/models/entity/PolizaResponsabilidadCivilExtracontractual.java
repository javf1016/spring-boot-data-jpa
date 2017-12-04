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
@Table(name="polizaResponsabilidadCivilExtracontractuales")
public class PolizaResponsabilidadCivilExtracontractual {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_poliza_responsabilidad_civil_extracontractual")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPolizaResponsabilidadCivilExtracontractual;
	
	@Column(name="numero_poliza_responsabilidad_civil_extracontractual")
	private int numeroPolizaResponsabilidadCivilExtracontractual;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_poliza_responsabilidad_civil_extracontractual")
	private Date fechaExpedicionPolizaResponsabilidadCivilExtracontractual;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_poliza_responsabilidad_civil_extracontractual")
	private Date fechaVencimientoPolizaResponsabilidadCivilExtracontractual;
	
	@Column(name="aviso_vencimiento_poliza_responsabilidad_civil_extracontractual")
	private int avisoVencimientoPolizaResponsabilidadCivilExtracontractual;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdPolizaResponsabilidadCivilExtracontractual() {
		return idPolizaResponsabilidadCivilExtracontractual;
	}

	public void setIdPolizaResponsabilidadCivilExtracontractual(Long idPolizaResponsabilidadCivilExtracontractual) {
		this.idPolizaResponsabilidadCivilExtracontractual = idPolizaResponsabilidadCivilExtracontractual;
	}

	public int getNumeroPolizaResponsabilidadCivilExtracontractual() {
		return numeroPolizaResponsabilidadCivilExtracontractual;
	}

	public void setNumeroPolizaResponsabilidadCivilExtracontractual(int numeroPolizaResponsabilidadCivilExtracontractual) {
		this.numeroPolizaResponsabilidadCivilExtracontractual = numeroPolizaResponsabilidadCivilExtracontractual;
	}

	public Date getFechaExpedicionPolizaResponsabilidadCivilExtracontractual() {
		return fechaExpedicionPolizaResponsabilidadCivilExtracontractual;
	}

	public void setFechaExpedicionPolizaResponsabilidadCivilExtracontractual(Date fechaExpedicionPolizaResponsabilidadCivilExtracontractual) {
		this.fechaExpedicionPolizaResponsabilidadCivilExtracontractual = fechaExpedicionPolizaResponsabilidadCivilExtracontractual;
	}

	public Date getFechaVencimientoPolizaResponsabilidadCivilExtracontractual() {
		return fechaVencimientoPolizaResponsabilidadCivilExtracontractual;
	}

	public void setFechaVencimientoPolizaResponsabilidadCivilExtracontractual(Date fechaVencimientoPolizaResponsabilidadCivilExtracontractual) {
		this.fechaVencimientoPolizaResponsabilidadCivilExtracontractual = fechaVencimientoPolizaResponsabilidadCivilExtracontractual;
	}

	public int getAvisoVencimientoPolizaResponsabilidadCivilExtracontractual() {
		return avisoVencimientoPolizaResponsabilidadCivilExtracontractual;
	}

	public void setAvisoVencimientoPolizaResponsabilidadCivilExtracontractual(int avisoVencimientoPolizaResponsabilidadCivilExtracontractual) {
		this.avisoVencimientoPolizaResponsabilidadCivilExtracontractual = avisoVencimientoPolizaResponsabilidadCivilExtracontractual;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
