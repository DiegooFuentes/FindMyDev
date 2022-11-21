package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Academica;
import cl.findmydev.web.models.DatoEmpresa;
import cl.findmydev.web.services.AcademicaServiceImpl;

@RestController
public class AcademicaApiRestController {
	@Autowired
	private AcademicaServiceImpl academicaServiceImpl;

	// http://localhost:8080/guardar/academica
	@RequestMapping("/guardar/academica")
	public Academica guardarAcademica(@RequestBody Academica academica) {
		return academicaServiceImpl.guardarAcademica(academica);
	}

	

}
