package cl.findmydev.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.findmydev.web.services.PostulanteServiceImpl;
import cl.findmydev.web.services.UsuarioServiceImpl;
import cl.findmydev.web.models.Postulante;
import cl.findmydev.web.models.Rol;
import cl.findmydev.web.models.Usuario;
import cl.findmydev.web.repositories.PostulanteRepository;
import cl.findmydev.web.repositories.UsuarioRepository;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	@Autowired
	PostulanteServiceImpl postulanteServiceImpl;
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	PostulanteRepository postulanteRepository;
	
	// ////////////REGISTRO/////////////
	
	@GetMapping("/registro")
	public String mostarRegistro() {
		return "registro_final.jsp";
	}
	
	
	@PostMapping("/registro")
	public String guardarFormulario(@RequestParam("correo")String correo,
			@RequestParam("password")String password,
			@RequestParam("password2")String password2,
			@RequestParam("rol")Rol rol,
			Model model
			){
		if (password.equals(password2)) {

			Usuario usuario = new Usuario();
			
			usuario.setCorreo(correo);
			usuario.setPassword(password);
			usuario.setRol(rol);
			

			Boolean resultado = usuarioServiceImpl.guardarUsuario(usuario);
				if (resultado) {
										
						Postulante postulante = new Postulante();
						postulante.setUsuario(usuario);
						postulanteServiceImpl.guardarPostulante(postulante);
						
						return "login_final.jsp";
					
				}else {
					model.addAttribute("msgError" , "Correo ya registrado" );
					return "registro_final.jsp";
				}
			 
		}else {
			model.addAttribute("msgError" , "Claves distintas" );
			return "registro_final.jsp";
		}
	}
	
	
	// ////////////LOGIN/////////////
	
	@GetMapping("/login")
	public String mostrarLogin() {
		return "login_final.jsp";
	}
	
	@PostMapping("/login")
	public String ingresoUsuario(@RequestParam("correo")String correo,
			@RequestParam("password")String password,
			Model model) {
		
		Boolean resultadoLogin = usuarioServiceImpl.ingresoUsuario(correo, password);
		if (resultadoLogin) {
			
			return "redirect:/home";
		}else {
			model.addAttribute("msgError" , "Verifica los datos ingresados" );
			return "login_final.jsp";
		}
	}
	
	
	

}
