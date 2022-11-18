package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Laboral;
import cl.findmydev.web.services.LaboralServiceImpl;

@RestController
public class LaboralApiRestController {

	@Autowired
private LaboralServiceImpl laboralServiceImpl;
	
	//http://localhost:8080/guardar/laboral
	@RequestMapping("/guardar/laboral")
	public Laboral guardarLaboral(@RequestBody Laboral laboral) {
		return laboralServiceImpl.guardarLaboral(laboral);
	}
	//------------------------------------------------------
	// http;//localhost:8080/actualizar/laboral
	
	@RequestMapping("/actualizar/laboral")
	public String actualizarLaboral(@RequestBody Laboral laboral) {
		return  laboralServiceImpl.actualizarLaboral(laboral);
		
		
		
		/* if(laboral.getId()!=null) {
		String mensaje =  laboralServiceImpl.actualizarLaboral(laboral);
			return mensaje;
		}
		return "No se actualizara ningun laboral"; */
	}

}
