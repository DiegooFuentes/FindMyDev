package cl.findmydev.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.findmydev.web.models.Usuario;
import cl.findmydev.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {

	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;

	@RequestMapping("/guardar/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}

	@RequestMapping("/eliminar/usuario")
	public String eliminarUsuario(@RequestParam(value = "id", required = false) Long id) {

		return usuarioServiceImpl.eliminarUsuario(id);
	}

	@RequestMapping("/actualizar/usuario")
	public String actualizarDatoContacto(@RequestBody Usuario usuario) {

		if (usuario.getId() != null) {
			String mensaje = usuarioServiceImpl.actualizarUsuario(usuario);
			return mensaje;
		}
		return "no se actualizara ningun usuario";
	}

	@RequestMapping("/obtener/usuario")
	public Usuario obtenerUsuario(@RequestParam(value = "id", required = true) Long id) {

		return usuarioServiceImpl.obtenerUsuario(id);
	}
}
