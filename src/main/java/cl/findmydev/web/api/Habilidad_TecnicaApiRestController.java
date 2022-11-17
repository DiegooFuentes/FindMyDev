package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Habilidad_Tecnica;
import cl.findmydev.web.services.Habilidad_TecnicaServiceImpl;

@RestController
public class Habilidad_TecnicaApiRestController {
	@Autowired
	private Habilidad_TecnicaServiceImpl habilidad_tecnicaServiceImpl;
	
	//http://localhost:8080/guardar/habilidad_tecnica
		@RequestMapping("/guardar/habilidad_tecnica")
		public Habilidad_Tecnica guardarhabilidad_tecnica(@RequestBody Habilidad_Tecnica habilidad_tecnica) {
			return habilidad_tecnicaServiceImpl.guardarHabilidad_Tecnica(habilidad_tecnica);
		}
	
}
