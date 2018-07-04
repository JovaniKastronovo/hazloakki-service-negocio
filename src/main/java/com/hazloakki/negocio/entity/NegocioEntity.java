package com.hazloakki.negocio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import com.hazloakki.negocio.modelo.NegocioDto;

import lombok.Builder;
import lombok.ToString;
import lombok.experimental.Tolerate;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */

@Builder // factoria statica para crear instancias
@Slf4j // genera log automatico
@Entity
@ToString
@Table(name = "cuenta")
public class NegocioEntity implements Serializable {

	/**
	 * Necesario por usar @Builder
	 */
	@Tolerate
	public NegocioEntity() {

	}

	@Version
	private Long version;
	@Column(name = "id_negocio")
	private Integer idNegocio;
	private String nombre;
	@Column(name = "id_categoria")
	private Integer idCategoria;
	private String email;
	private String descripcion;
	private String telefono;
	private String domicilio;
	private Double latitud;
	private Double longitud;
	@Column(name = "id_metodo_pago")
	private Integer idMetodoPago;
	@Column(name = "tarjeta_credito")
	private String tipoTarjetCredito;
	@Column(name = "servicio_domicilio")
	private boolean servicioDomicilio;
	private boolean estacionamiento;
	private boolean internet;
	private boolean reservaciones;
	private boolean estatus;
	@Column(name = "modo_llevar")
	private boolean modoLlevar;

	public static NegocioEntity from(NegocioDto cuentaDto) {

		NegocioEntity negocioEntity = new NegocioEntity();
			negocioEntity.setIdNegocio(cuentaDto.getIdNegocio());
			negocioEntity.setNombre(cuentaDto.getNombre());
			negocioEntity.setIdCategoria(cuentaDto.getIdCategoria());
			negocioEntity.setEmail(cuentaDto.getEmail());
			negocioEntity.setDescripcion(cuentaDto.getDescripcion());
			negocioEntity.setTelefono(cuentaDto.getTelefono());
			negocioEntity.setDomicilio(cuentaDto.getDomicilio());
			negocioEntity.setLatitud(cuentaDto.getLatitud());
			negocioEntity.setLongitud(cuentaDto.getLongitud());
			negocioEntity.setIdMetodoPago(cuentaDto.getIdMetodoPago());
			negocioEntity.setTipoTarjetCredito(cuentaDto.getTipoTarjetCredito());
			negocioEntity.setServicioDomicilio(cuentaDto.isServicioDomicilio());
			negocioEntity.setEstacionamiento(cuentaDto.isEstacionamiento());
			negocioEntity.setInternet(cuentaDto.isInternet());
			negocioEntity.setReservaciones(cuentaDto.isReservaciones());
			negocioEntity.setModoLlevar(cuentaDto.isModoLlevar());
			negocioEntity.setEstatus(cuentaDto.isEstatus());

		return null;

	}

	public NegocioDto to() {

		NegocioDto negocioDto = new NegocioDto();
			negocioDto.setIdNegocio(getIdNegocio());
			negocioDto.setNombre(getNombre());
			negocioDto.setIdCategoria(getIdCategoria());
			negocioDto.setEmail(getEmail());
			negocioDto.setDescripcion(getDescripcion());
			negocioDto.setTelefono(getTelefono());
			negocioDto.setDomicilio(getDomicilio());
			negocioDto.setLatitud(getLatitud());
			negocioDto.setLongitud(getLongitud());
			negocioDto.setIdMetodoPago(getIdMetodoPago());
			negocioDto.setTipoTarjetCredito(getTipoTarjetCredito());
			negocioDto.setServicioDomicilio(isServicioDomicilio());
			negocioDto.setEstacionamiento(isEstacionamiento());
			negocioDto.setInternet(isInternet());
			negocioDto.setReservaciones(isReservaciones());
			negocioDto.setModoLlevar(isModoLlevar());
			negocioDto.setEstatus(isEstatus());

		return negocioDto;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Integer getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(Integer idNegocio) {
		this.idNegocio = idNegocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(Integer idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public String getTipoTarjetCredito() {
		return tipoTarjetCredito;
	}

	public void setTipoTarjetCredito(String tipoTarjetCredito) {
		this.tipoTarjetCredito = tipoTarjetCredito;
	}

	public boolean isServicioDomicilio() {
		return servicioDomicilio;
	}

	public void setServicioDomicilio(boolean servicioDomicilio) {
		this.servicioDomicilio = servicioDomicilio;
	}

	public boolean isEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(boolean estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public boolean isReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(boolean reservaciones) {
		this.reservaciones = reservaciones;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public boolean isModoLlevar() {
		return modoLlevar;
	}

	public void setModoLlevar(boolean modoLlevar) {
		this.modoLlevar = modoLlevar;
	}

}