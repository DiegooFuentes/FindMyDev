package cl.findmydev.web.controllers;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.findmydev.web.models.Laboral;
import cl.findmydev.web.models.Usuario;
import cl.findmydev.web.services.LaboralServiceImpl;
import cl.findmydev.web.services.UsuarioServiceImpl;


@Controller
@RequestMapping("/miPerfil")
public class MiPerfilController {
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	@Autowired
	LaboralServiceImpl laboralServiceImpl;
	
	@GetMapping ("")
	public String miPerfil() {
		return "miPerfil.jsp";
	}
	
	@GetMapping ("/datoslaborales")
	public String datosLaboral() {
		return "laboral.jsp";
	}
	
	@PostMapping("/datoslaborales")
	public String guardarFormLaboral(@RequestParam ("nombre")String nombre,
			@RequestParam("descripcion")String descripcion,
			
			Model model,
			HttpSession session) {
		String correo = (String) session.getAttribute("usuarioCorreo");
		Usuario usuario = usuarioServiceImpl.obtenerUsuarioCorreo(correo);
		
		Laboral laboral = new Laboral();
		laboral.setNombre(nombre);
		laboral.setDescripcion(descripcion);

		laboralServiceImpl.guardarLaboral(laboral);
		model.addAttribute(laboral);
		return "redirect:/datoslaborales";
		
	}
}
