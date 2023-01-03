package cl.findmydev.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.findmydev.web.models.Habilidad_Blanda;
import cl.findmydev.web.models.Hblanda_usuario;
import cl.findmydev.web.models.Rol;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping ("")
	public String mostrarHome() {
		return "home.jsp";
	}
	
	@GetMapping ("/miperfil")
	public String mostrarMiPerfil() {
		return "perfil_postulante.jsp";
	}
	
	@GetMapping ("/miperfil/habilidadesblandas")
	public String mostrarHabilidadesBlandas() {
		return "registro_habilidades_blandas.jsp";
	}
	
	@PostMapping ("/miperfil/habilidadesblandas/formulario")
	public String guardarHabilidadesBlandas(@RequestParam("comunicacion")Long comunicacion,
			@RequestParam("equipo")Long equipo,
			@RequestParam("detalle")Long detalle,
			@RequestParam("tiempo")Long tiempo
			){
		
		Hblanda_usuario hblanda_usuario = new Hblanda_usuario();
		hblanda_usuario.setHabilidad_blanda_id(comunicacion);
		hblanda_usuario.setHabilidad_blanda_id(equipo);
		hblanda_usuario.setHabilidad_blanda_id(detalle);
		hblanda_usuario.setHabilidad_blanda_id(tiempo); 
		
		return "redirect:/home/miperfil/habilidadesblandas";
	}
	
}
