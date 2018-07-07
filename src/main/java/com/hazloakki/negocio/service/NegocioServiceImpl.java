package com.hazloakki.negocio.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazloakki.negocio.api.NegocioException;
import com.hazloakki.negocio.entity.NegocioEntity;
import com.hazloakki.negocio.modelo.NegocioDto;
import com.hazloakki.negocio.repository.NegocioRepository;

/**
 * @author Jovani Arzate 2018-07-01 HazloAkki para Empresas v.1
 *
 */
@Service
public class NegocioServiceImpl implements NegocioService {

	@Autowired
	private NegocioRepository negocioRepository;

	@Transactional
	@Override
	public NegocioEntity guardarNegocio(NegocioDto negocioDto) {
		NegocioEntity negocioEntity = NegocioEntity.from(negocioDto);
		return negocioRepository.save(negocioEntity);
	}

	@Override
	public NegocioEntity obtenerNegocio(String idNegocio) {
		return negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));

	}

	@Transactional
	@Override
	public NegocioEntity modificaNegocio(String idNegocio, NegocioDto cuentaDto) {

		NegocioEntity negocioEntity = negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));

		negocioEntity = NegocioEntity.from(cuentaDto);
		negocioEntity.setId(idNegocio);

		return negocioRepository.save(negocioEntity);
	}

	@Transactional
	@Override
	public void borrarNegocio(String idNegocio) {
		NegocioEntity negocioEntity = negocioRepository.findById(idNegocio)
				.orElseThrow(() -> NegocioException.from("No se encontro el negocio : " + idNegocio, idNegocio));

		negocioRepository.delete(negocioEntity);
	}

	@Override
<<<<<<< HEAD
	public List<NegocioEntity> obtenerAllNegociosByCuenta(String idCuenta) {

		return negocioRepository.findByIdCuentaAndEstatus(idCuenta,Boolean.TRUE);
=======
	public List<NegocioDto> obtenerAllNegociosByCuenta() {
		// TODO Auto-generated method stub
		return null;
>>>>>>> 25439c6c3f7db68f6fede0434c87b051badcaf3b
	}

}
