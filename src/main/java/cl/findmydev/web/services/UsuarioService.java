package cl.findmydev.web.services;

import cl.findmydev.web.models.Usuario;

public interface UsuarioService {

	public Usuario guardarUsuario(Usuario usuario);

	public String eliminarUsuario(Long id);

	public String actualizarUsuario(Usuario usuario);

	public Usuario obtenerUsuario(Long id);
}
