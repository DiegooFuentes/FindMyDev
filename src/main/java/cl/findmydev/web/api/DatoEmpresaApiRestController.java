package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.DatoEmpresa;

import cl.findmydev.web.services.DatoEmpresaServiceImpl;

@RestController
public class DatoEmpresaApiRestController {

	@Autowired
	private DatoEmpresaServiceImpl datoEmpresaServiceImpl;

	// http://localhost:8080/guardar/academica
	@RequestMapping("/guardar/datoEmpresa")
	public DatoEmpresa guardarDatoEmpresa(@RequestBody DatoEmpresa datoEmpresa) {
		return datoEmpresaServiceImpl.guardarDatoEmpresa(datoEmpresa);
	}

}
