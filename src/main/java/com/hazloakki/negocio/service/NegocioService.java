package com.hazloakki.negocio.service;

import com.hazloakki.negocio.entity.NegocioEntity;
import com.hazloakki.negocio.modelo.NegocioDto;
/**
 * @author Jovani Arzate
 * 2018-07-01
 * HazloAkki para Empresas v.1
 *
 */
public interface NegocioService {

	NegocioEntity guardarNegocio(NegocioDto cuentaDto);
	NegocioEntity obtenerNegocio(NegocioDto cuentaDto);
}
