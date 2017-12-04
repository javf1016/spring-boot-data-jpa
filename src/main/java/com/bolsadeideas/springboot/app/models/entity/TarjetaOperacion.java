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
@Table(name="tarjeta_operaciones")
public class TarjetaOperacion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_tarjeta_operacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTarjetaOperacion;
	
	@Column(name="numero_tarjeta_operacion")
	private int numeroTarjetaOperacion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_tarjeta_operacion")
	private Date fechaExpedicionTarjetaOperacion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_tarjeta_operacion")
	private Date fechaVencimientoTarjetaOperacion;
	
	@Column(name="aviso_vencimiento_tarjeta_operacion")
	private int avisoVencimientoTarjetaOperacion;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdTarjetaOperacion() {
		return idTarjetaOperacion;
	}

	public void setIdTarjetaOperacion(Long idTarjetaOperacion) {
		this.idTarjetaOperacion = idTarjetaOperacion;
	}

	public int getNumeroTarjetaOperacion() {
		return numeroTarjetaOperacion;
	}

	public void setNumeroTarjetaOperacion(int numeroTarjetaOperacion) {
		this.numeroTarjetaOperacion = numeroTarjetaOperacion;
	}

	public Date getFechaExpedicionTarjetaOperacion() {
		return fechaExpedicionTarjetaOperacion;
	}

	public void setFechaExpedicionTarjetaOperacion(Date fechaExpedicionTarjetaOperacion) {
		this.fechaExpedicionTarjetaOperacion = fechaExpedicionTarjetaOperacion;
	}

	public Date getFechaVencimientoTarjetaOperacion() {
		return fechaVencimientoTarjetaOperacion;
	}

	public void setFechaVencimientoTarjetaOperacion(Date fechaVencimientoTarjetaOperacion) {
		this.fechaVencimientoTarjetaOperacion = fechaVencimientoTarjetaOperacion;
	}

	public int getAvisoVencimientoTarjetaOperacion() {
		return avisoVencimientoTarjetaOperacion;
	}

	public void setAvisoVencimientoTarjetaOperacion(int avisoVencimientoTarjetaOperacion) {
		this.avisoVencimientoTarjetaOperacion = avisoVencimientoTarjetaOperacion;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
