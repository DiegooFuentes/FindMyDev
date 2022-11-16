package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.DatoContacto;
import cl.findmydev.web.services.DatoContactoServiceImpl;

@RestController
public class DatoContactoApiRestController {

	@Autowired
	private DatoContactoServiceImpl datoContactoServiceImpl;
	
	@RequestMapping ("/guardar/datoContacto")
	public DatoContacto guardarDatoContacto (@RequestBody DatoContacto datoContacto) {
		return datoContactoServiceImpl.guardarDatoContacto(datoContacto);
	}
}
