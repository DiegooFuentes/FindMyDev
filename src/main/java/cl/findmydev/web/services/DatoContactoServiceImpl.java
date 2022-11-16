package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.DatoContacto;
import cl.findmydev.web.repositories.DatoContactoRepository;

@Service
public class DatoContactoServiceImpl implements DatoContactoService {

	@Autowired
	private DatoContactoRepository datoContactoRepository;
	
	@Override
	public DatoContacto guardarDatoContacto(DatoContacto datoContacto) {
		return datoContactoRepository.save(datoContacto);
	}


}
