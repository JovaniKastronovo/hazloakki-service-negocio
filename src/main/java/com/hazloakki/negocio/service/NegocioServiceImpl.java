package com.hazloakki.negocio.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hazloakki.negocio.api.NegocioException;
import com.hazloakki.negocio.entity.NegocioEntity;
import com.hazloakki.negocio.modelo.NegocioDto;
import com.hazloakki.negocio.repository.NegocioRepository;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
public class NegocioServiceImpl implements NegocioService {

	@Autowired
	private NegocioRepository negocioRepository;

	@Override
	public NegocioEntity guardarNegocio(NegocioDto negocioDto) {
		NegocioEntity negocioEntity = NegocioEntity.from(negocioDto);
		return negocioRepository.save(negocioEntity);
	}

	@Override
	public NegocioEntity obtenerNegocio(NegocioDto negocioDto) {
		return negocioRepository.consultaCuenta(negocioDto.getIdNegocio()).orElseThrow(() -> NegocioException
				.from("No se encontro el negocio : '%s'", String.valueOf(negocioDto.getIdNegocio())));

	}

}
