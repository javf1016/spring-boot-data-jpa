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
@Table(name="certificadoVinculaciones")
public class CertificadoVinculacion {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_certificado_vinculacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertificadoVinculacion;
	
	@Column(name="numero_certificado_vinculacion")
	private int numeroCertificadoVinculacion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_certificado_vinculacion")
	private Date fechaExpedicionCertificadoVinculacion;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_certificado_vinculacion")
	private Date fechaVencimientoCertificadoVinculacion;
	
	@Column(name="aviso_vencimiento_certificado_vinculacion")
	private int avisoVencimientoCertificadoVinculacion;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdCertificadoVinculacion() {
		return idCertificadoVinculacion;
	}

	public void setIdCertificadoVinculacion(Long idCertificadoVinculacion) {
		this.idCertificadoVinculacion = idCertificadoVinculacion;
	}

	public int getNumeroCertificadoVinculacion() {
		return numeroCertificadoVinculacion;
	}

	public void setNumeroCertificadoVinculacion(int numeroCertificadoVinculacion) {
		this.numeroCertificadoVinculacion = numeroCertificadoVinculacion;
	}

	public Date getFechaExpedicionCertificadoVinculacion() {
		return fechaExpedicionCertificadoVinculacion;
	}

	public void setFechaExpedicionCertificadoVinculacion(Date fechaExpedicionCertificadoVinculacion) {
		this.fechaExpedicionCertificadoVinculacion = fechaExpedicionCertificadoVinculacion;
	}

	public Date getFechaVencimientoCertificadoVinculacion() {
		return fechaVencimientoCertificadoVinculacion;
	}

	public void setFechaVencimientoCertificadoVinculacion(Date fechaVencimientoCertificadoVinculacion) {
		this.fechaVencimientoCertificadoVinculacion = fechaVencimientoCertificadoVinculacion;
	}

	public int getAvisoVencimientoCertificadoVinculacion() {
		return avisoVencimientoCertificadoVinculacion;
	}

	public void setAvisoVencimientoCertificadoVinculacion(int avisoVencimientoCertificadoVinculacion) {
		this.avisoVencimientoCertificadoVinculacion = avisoVencimientoCertificadoVinculacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
