package cl.findmydev.web.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Usuario;
import cl.findmydev.web.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public String eliminarUsuario(Long id) {
		usuarioRepository.deleteById(id);

		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if (usuario != null) {
			return "Usuario no eliminado";
		}
		return "El usuario fue eliminado";
	}

	@Override
	public String actualizarUsuario(Usuario usuario) {

		Boolean existe = usuarioRepository.existsById(usuario.getId());

		if (existe) {
			usuarioRepository.save(usuario);
			return "Usuario actualizado";
		}

		return "Usuario creado";
	}

	@Override
	public Usuario obtenerUsuario(Long id) {

		Boolean existe = usuarioRepository.existsById(id);

		if (existe) {
			Usuario user = usuarioRepository.findById(id).get();
			return user;
		}
		return null;
	}

}
