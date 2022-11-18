package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Proyecto;
import cl.findmydev.web.services.ProyectoServiceImpl;

@RestController
public class ProyectoApiRestController {
	@Autowired
	private ProyectoServiceImpl proyectoServiceImpl;
	

	//http://localhost:8080/guardar/proyecto
	@RequestMapping("/guardar/proyecto")
	public Proyecto guardarproyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	//ELIMINA PROYECTO 
	@RequestMapping("/eliminar/proyecto")
	public String eliminarProyecto(@RequestParam(value="id",required=true) Long id ) {
		return proyectoServiceImpl.eliminarProyecto(id);
	}
	
	//Actualizar un Proyecto
	 @RequestMapping("/actualizar/proyecto")
	 public String actualizarProyecto(@RequestBody Proyecto proyecto) {
		 if(proyecto.getId()!=null) {
				String mensaje = proyectoServiceImpl.actualizarProyecto(proyecto);
				return mensaje;
			}
			return "NO SE PUEDE ACTUALIZAR SI NO ESTA CREADO";
		}
	 }

