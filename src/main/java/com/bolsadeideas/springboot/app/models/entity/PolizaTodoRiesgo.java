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
@Table(name="polizaTodoRiesgos")
public class PolizaTodoRiesgo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_poliza_todo_riesgo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPolizaTodoRiesgo;
	
	@Column(name="numero_poliza_todo_riesgo")
	private int numeroPolizaTodoRiesgo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_poliza_todo_riesgo")
	private Date fechaExpedicionPolizaTodoRiesgo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_poliza_todo_riesgo")
	private Date fechaVencimientoPolizaTodoRiesgo;
	
	@Column(name="aviso_vencimiento_poliza_todo_riesgo")
	private int avisoVencimientoPolizaTodoRiesgo;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdPolizaTodoRiesgo() {
		return idPolizaTodoRiesgo;
	}

	public void setIdPolizaTodoRiesgo(Long idPolizaTodoRiesgo) {
		this.idPolizaTodoRiesgo = idPolizaTodoRiesgo;
	}

	public int getNumeroPolizaTodoRiesgo() {
		return numeroPolizaTodoRiesgo;
	}

	public void setNumeroPolizaTodoRiesgo(int numeroPolizaTodoRiesgo) {
		this.numeroPolizaTodoRiesgo = numeroPolizaTodoRiesgo;
	}

	public Date getFechaExpedicionPolizaTodoRiesgo() {
		return fechaExpedicionPolizaTodoRiesgo;
	}

	public void setFechaExpedicionPolizaTodoRiesgo(Date fechaExpedicionPolizaTodoRiesgo) {
		this.fechaExpedicionPolizaTodoRiesgo = fechaExpedicionPolizaTodoRiesgo;
	}

	public Date getFechaVencimientoPolizaTodoRiesgo() {
		return fechaVencimientoPolizaTodoRiesgo;
	}

	public void setFechaVencimientoPolizaTodoRiesgo(Date fechaVencimientoPolizaTodoRiesgo) {
		this.fechaVencimientoPolizaTodoRiesgo = fechaVencimientoPolizaTodoRiesgo;
	}

	public int getAvisoVencimientoPolizaTodoRiesgo() {
		return avisoVencimientoPolizaTodoRiesgo;
	}

	public void setAvisoVencimientoPolizaTodoRiesgo(int avisoVencimientoPolizaTodoRiesgo) {
		this.avisoVencimientoPolizaTodoRiesgo = avisoVencimientoPolizaTodoRiesgo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
