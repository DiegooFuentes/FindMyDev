package cl.findmydev.web.services;

import cl.findmydev.web.models.Laboral;
import cl.findmydev.web.models.Usuario;

public interface LaboralService {
	
	public Laboral guardarLaboral(Laboral laboral);

	public String actualizarLaboral(Laboral laboral);

}
