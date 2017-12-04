package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="vehiculos")
public class Vehiculo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVehiculo;
	
	@NotEmpty
	private String movil;
	
	@NotEmpty
	private String placa;
	
	@NotEmpty
	private String estado;
	
	@Column(name="condicion_tenencia")
	private String condicionTenencia;
	
	@NotEmpty
	@Column(name="tipo_operacion")
	private String tipoOperacion;
	
	@NotEmpty
	private String tipologia;
	
	@NotNull
	private int modelo;
	
	@Column(name="fecha_matricula")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaMatricula;
	
	@Column(name="fecha_vinculacion")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaVinculacion;
	
	@Column(name="vida_util_12")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date vidaUtil12;

	@Column(name="vida_util_14")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date vidaUtil14;
	
	@NotEmpty
	private String marca;
	
	@NotEmpty
	private String linea;
	
	@NotEmpty
	@Column(name="numero_motor")
	private String numeroMotor;
	
	@NotEmpty
	@Column(name="numero_chasis")
	private String numeroChasis;
	
	@NotEmpty
	@Column(name="tipo_carroceria")
	private String tipoCarroceria;
	
	@NotEmpty
	@Column(name="marca_carroceria")
	private String marcaCarroceria;
	
	@NotEmpty
	@Column(name="tipo_combustible")
	private String tipoCombustible;
	
	@NotNull
	@Column(name="capacidad_pasajeros")
	private int capacidadPasajeros;
	
	@NotNull
	@Column(name="numero_puertas")
	private int numeroPuertas;
	
	@NotNull
	private int cilindraje;
	
	@NotNull
	@Column(name="numero_licencia")
	private int numeroLicencia;
	
	@Column(name="fecha_expedicion")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaExpedicion;
	
	@NotNull
	@Column(name="numero_importacion")
	private int numero_importacion;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_soat")
	private Soat idSoat;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_tarjeta_operacion")
	private TarjetaOperacion idTarjetaOperacion;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_certificado_vinculacion")
	private CertificadoVinculacion idCertificadoVinculacion;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_certificado_revision_tecnomecanica")
	private CertificadoRevisionTecnomecanica idCertificadoRevisionTecnomecanica;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_poliza_responsabilidad_civil")
	private PolizaResponsabilidadCivil idPolizaResponsabilidadCivil;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_poliza_responsabilidad_civil_extracontractual")
	private PolizaResponsabilidadCivilExtracontractual idPolizaResponsabilidadCivilExtracontractual;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "id_poliza_todo_riesgo")
	private PolizaTodoRiesgo idPolizaTodoRiesgo;

	public Long getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCondicionTenencia() {
		return condicionTenencia;
	}

	public void setCondicionTenencia(String condicionTenencia) {
		this.condicionTenencia = condicionTenencia;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public Date getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(Date fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Date getFechaVinculacion() {
		return fechaVinculacion;
	}

	public void setFechaVinculacion(Date fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}

	public Date getVidaUtil12() {
		return vidaUtil12;
	}

	public void setVidaUtil12(Date vidaUtil12) {
		this.vidaUtil12 = vidaUtil12;
	}

	public Date getVidaUtil14() {
		return vidaUtil14;
	}

	public void setVidaUtil14(Date vidaUtil14) {
		this.vidaUtil14 = vidaUtil14;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public String getNumeroChasis() {
		return numeroChasis;
	}

	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public String getMarcaCarroceria() {
		return marcaCarroceria;
	}

	public void setMarcaCarroceria(String marcaCarroceria) {
		this.marcaCarroceria = marcaCarroceria;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public int getNumero_importacion() {
		return numero_importacion;
	}

	public void setNumero_importacion(int numero_importacion) {
		this.numero_importacion = numero_importacion;
	}

	public Soat getIdSoat() {
		return idSoat;
	}

	public void setIdSoat(Soat idSoat) {
		this.idSoat = idSoat;
	}

	public TarjetaOperacion getIdTarjetaOperacion() {
		return idTarjetaOperacion;
	}

	public void setIdTarjetaOperacion(TarjetaOperacion idTarjetaOperacion) {
		this.idTarjetaOperacion = idTarjetaOperacion;
	}

	public CertificadoVinculacion getIdCertificadoVinculacion() {
		return idCertificadoVinculacion;
	}

	public void setIdCertificadoVinculacion(CertificadoVinculacion idCertificadoVinculacion) {
		this.idCertificadoVinculacion = idCertificadoVinculacion;
	}

	public CertificadoRevisionTecnomecanica getidCertificadoRevisionTecnomecanica() {
		return idCertificadoRevisionTecnomecanica;
	}

	public void setidCertificadoRevisionTecnomecanica(CertificadoRevisionTecnomecanica idCertificadoRevisionTecnomecanica) {
		this.idCertificadoRevisionTecnomecanica = idCertificadoRevisionTecnomecanica;
	}

	public PolizaResponsabilidadCivil getIdPolizaResponsabilidadCivil() {
		return idPolizaResponsabilidadCivil;
	}

	public void setIdPolizaResponsabilidadCivil(PolizaResponsabilidadCivil idPolizaResponsabilidadCivil) {
		this.idPolizaResponsabilidadCivil = idPolizaResponsabilidadCivil;
	}

	public PolizaResponsabilidadCivilExtracontractual getIdPolizaResponsabilidadCivilExtracontractual() {
		return idPolizaResponsabilidadCivilExtracontractual;
	}

	public void setIdPolizaResponsabilidadCivilExtracontractual(
			PolizaResponsabilidadCivilExtracontractual idPolizaResponsabilidadCivilExtracontractual) {
		this.idPolizaResponsabilidadCivilExtracontractual = idPolizaResponsabilidadCivilExtracontractual;
	}

	public PolizaTodoRiesgo getIdPolizaTodoRiesgo() {
		return idPolizaTodoRiesgo;
	}

	public void setIdPolizaTodoRiesgo(PolizaTodoRiesgo idPolizaTodoRiesgo) {
		this.idPolizaTodoRiesgo = idPolizaTodoRiesgo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
