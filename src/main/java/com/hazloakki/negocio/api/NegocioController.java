package com.hazloakki.negocio.api;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hazloakki.negocio.modelo.NegocioDto;
import com.hazloakki.negocio.service.NegocioService;


/**
 * @author Jovani Arzate
 * 2018-07-01
 * HazloAkki para Empresas v.1
 *
 */
@RestController
@RequestMapping("/api/v1/negocios")
public class NegocioController {
	
	@Autowired
	private NegocioService cuentaService;

	@PostMapping
	@ResponseStatus(CREATED)
	public NegocioDto crearNegocio(@RequestBody NegocioDto negocioDto) {
		return cuentaService.guardarNegocio(negocioDto).to();
	}

	@PostMapping
	@ResponseStatus(OK)
	public NegocioDto negocios(@RequestBody NegocioDto cuentaDto) {
		return cuentaService.obtenerNegocio(cuentaDto).to();
	}

}
