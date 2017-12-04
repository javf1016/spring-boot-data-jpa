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
@Table(name="certificadoRevisionTecnomecanicas")
public class CertificadoRevisionTecnomecanica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_certificado_revision_tecnomecanica")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertificadoRevisionTecnomecanica;
	
	@Column(name="numero_certificado_revision_tecnomecanica")
	private int numeroCertificadoRevisionTecnomecanica;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_expedicion_certificado_revision_tecnomecanica")
	private Date fechaExpedicionCertificadoRevisionTecnomecanica;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_certificado_revision_tecnomecanica")
	private Date fechaVencimientoCertificadoRevisionTecnomecanica;
	
	@Column(name="aviso_vencimiento_certificado_revision_tecnomecanica")
	private int avisoVencimientoCertificadoRevisionTecnomecanica;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Vehiculo vehiculo;

	public Long getIdCertificadoRevisionTecnomecanica() {
		return idCertificadoRevisionTecnomecanica;
	}

	public void setIdCertificadoRevisionTecnomecanica(Long idCertificadoRevisionTecnomecanica) {
		this.idCertificadoRevisionTecnomecanica = idCertificadoRevisionTecnomecanica;
	}

	public int getNumeroCertificadoRevisionTecnomecanica() {
		return numeroCertificadoRevisionTecnomecanica;
	}

	public void setNumeroCertificadoRevisionTecnomecanica(int numeroCertificadoRevisionTecnomecanica) {
		this.numeroCertificadoRevisionTecnomecanica = numeroCertificadoRevisionTecnomecanica;
	}

	public Date getFechaExpedicionCertificadoRevisionTecnomecanica() {
		return fechaExpedicionCertificadoRevisionTecnomecanica;
	}

	public void setFechaExpedicionCertificadoRevisionTecnomecanica(Date fechaExpedicionCertificadoRevisionTecnomecanica) {
		this.fechaExpedicionCertificadoRevisionTecnomecanica = fechaExpedicionCertificadoRevisionTecnomecanica;
	}

	public Date getFechaVencimientoCertificadoRevisionTecnomecanica() {
		return fechaVencimientoCertificadoRevisionTecnomecanica;
	}

	public void setFechaVencimientoCertificadoRevisionTecnomecanica(Date fechaVencimientoCertificadoRevisionTecnomecanica) {
		this.fechaVencimientoCertificadoRevisionTecnomecanica = fechaVencimientoCertificadoRevisionTecnomecanica;
	}

	public int getAvisoVencimientoCertificadoRevisionTecnomecanica() {
		return avisoVencimientoCertificadoRevisionTecnomecanica;
	}

	public void setAvisoVencimientoCertificadoRevisionTecnomecanica(int avisoVencimientoCertificadoRevisionTecnomecanica) {
		this.avisoVencimientoCertificadoRevisionTecnomecanica = avisoVencimientoCertificadoRevisionTecnomecanica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
