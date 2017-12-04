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
@Table(name="soats")
public class Soat {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_soat")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSoat;
	
	@Column(name="numero_poliza_soat")
	private int numeroPolizaSoat;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_soat")
	private Date fechaExpedicionSoat;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_soat")
	private Date fechaVencimientoSoat;
	
	@Column(name="aviso_vencimiento_soat")
	private int avisoVencimientoSoat;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdSoat() {
		return idSoat;
	}

	public void setIdSoat(Long idSoat) {
		this.idSoat = idSoat;
	}

	public int getNumeroPolizaSoat() {
		return numeroPolizaSoat;
	}

	public void setNumeroPolizaSoat(int numeroPolizaSoat) {
		this.numeroPolizaSoat = numeroPolizaSoat;
	}

	public Date getFechaExpedicionSoat() {
		return fechaExpedicionSoat;
	}

	public void setFechaExpedicionSoat(Date fechaExpedicionSoat) {
		this.fechaExpedicionSoat = fechaExpedicionSoat;
	}

	public Date getFechaVencimientoSoat() {
		return fechaVencimientoSoat;
	}

	public void setFechaVencimientoSoat(Date fechaVencimientoSoat) {
		this.fechaVencimientoSoat = fechaVencimientoSoat;
	}

	public int getAvisoVencimientoSoat() {
		return avisoVencimientoSoat;
	}

	public void setAvisoVencimientoSoat(int avisoVencimientoSoat) {
		this.avisoVencimientoSoat = avisoVencimientoSoat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
