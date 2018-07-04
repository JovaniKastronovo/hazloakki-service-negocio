package com.hazloakki.negocio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazloakki.negocio.entity.NegocioEntity;

/**
 * @author Jovani Arzate
 * 2018-07-01
 * HazloAkki para Empresas v.1
 *
 */

public interface NegocioRepository extends JpaRepository<NegocioEntity, String>{

	Optional<NegocioEntity> consultaCuenta(Integer idNegocio);
}
