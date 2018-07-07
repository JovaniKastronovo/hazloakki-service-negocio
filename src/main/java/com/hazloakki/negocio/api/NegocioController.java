package com.hazloakki.negocio.api;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hazloakki.negocio.entity.NegocioEntity;
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

	@GetMapping("/{id}")
	public NegocioDto redNegocio(@PathVariable("id") String idNegocio) {
		return cuentaService.obtenerNegocio(idNegocio).to();
	}
	
	@PutMapping("/{id}")
	public NegocioDto modificaNegocio(@PathVariable("id") String idNegocio,@RequestBody NegocioDto cuentaDto) {
		return cuentaService.modificaNegocio(idNegocio, cuentaDto).to();
	}
	
	@DeleteMapping("/{id}")
	public void borrarNegocio(@PathVariable("id") String idNegocio) {
		cuentaService.borrarNegocio(idNegocio);
	}
	
	/*
	 * Remotos
	 */

	@GetMapping("/cuenta/{id}")
	public List<NegocioEntity> redAllNegocios(@PathVariable("id") String idCuenta) {
		return cuentaService.obtenerAllNegociosByCuenta(idCuenta);
	}
	
}
