package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Laboral;
import cl.findmydev.web.models.Usuario;
import cl.findmydev.web.repositories.LaboralRepository;

@Service
public class LaboralServiceImpl implements LaboralService {

	
	// Metodo SAVE ----------------------
	@Autowired
	private LaboralRepository laboralRepository;

	@Override
	public Laboral guardarLaboral(Laboral laboral) {
		return laboralRepository.save(laboral);
	}

	// Metodo Actualizar Update -----------------
	@Override
	public String actualizarLaboral(Laboral laboral) {

		Boolean existe = laboralRepository.existsById(laboral.getId());
		
		if(existe) {
			laboralRepository.save(laboral);
			return "Laboral actualizado";
		}
		return "Laboral no actualizado";
	}
	
	
}

