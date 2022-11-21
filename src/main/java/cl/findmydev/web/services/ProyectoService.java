package cl.findmydev.web.services;

import cl.findmydev.web.models.Proyecto;

public interface ProyectoService {

	public Proyecto guardarProyecto(Proyecto proyecto);
	// eliminar un proyecto 
	public String eliminarProyecto(Long id); // string ya que no retorna nada mas que un mensaje !!
	
	//Actualizar Proyecto
	public String actualizarProyecto(Proyecto proyecto);
}
