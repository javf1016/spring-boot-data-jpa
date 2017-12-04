package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="accidentalidades")
public class Accidentalidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id_sae")
	@NotEmpty
	private Long idSae;

	@NotEmpty
	private String instante;
	
	@NotEmpty
	private String dia;
	
	@Column(name="franja_horaria")
	@NotEmpty
	private String franjaHoraria;
	
	@NotEmpty
	private String clase;
	
	@NotEmpty
	private String tipo;
	
	@NotEmpty
	private String afectacion;
	
	@Column(name="reportado_por")
	@NotEmpty
	private String reportadoPor;
	
	@Column(name="id_clase")
	@NotEmpty
	private String idClase;
	
	@Column(name="tipo_servicio")
	@NotEmpty
	private String tipoServicio;
	
	@NotEmpty
	private String empresa;

	@NotEmpty
	private String concesion;
	
	@NotEmpty
	private String linea;
	
	@NotEmpty
	private String ruta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdSae() {
		return idSae;
	}

	public void setIdSae(Long idSae) {
		this.idSae = idSae;
	}

	public String getInstante() {
		return instante;
	}

	public void setInstante(String instante) {
		this.instante = instante;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(String franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAfectacion() {
		return afectacion;
	}

	public void setAfectacion(String afectacion) {
		this.afectacion = afectacion;
	}

	public String getReportadoPor() {
		return reportadoPor;
	}

	public void setReportadoPor(String reportadoPor) {
		this.reportadoPor = reportadoPor;
	}

	public String getIdClase() {
		return idClase;
	}

	public void setIdClase(String idClase) {
		this.idClase = idClase;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getConcesion() {
		return concesion;
	}

	public void setConcesion(String concesion) {
		this.concesion = concesion;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
