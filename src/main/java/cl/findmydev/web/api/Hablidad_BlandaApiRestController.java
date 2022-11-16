package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Academica;
import cl.findmydev.web.models.Habilidad_Blanda;
import cl.findmydev.web.services.Habilidad_BlandaServiceImpl;

@RestController
public class Hablidad_BlandaApiRestController {
	@Autowired
	private Habilidad_BlandaServiceImpl habilidad_BlandaServiceImpl;
	
	//http://localhost:8080/guardar/habilidad_blanda
		@RequestMapping("/guardar/habilidad_blanda")
		public Habilidad_Blanda guardarHabilidad_Blanda(@RequestBody Habilidad_Blanda habilidad_Blanda) {
			return habilidad_BlandaServiceImpl.guardarHabilidad_Blanda(habilidad_Blanda);
		}
}
