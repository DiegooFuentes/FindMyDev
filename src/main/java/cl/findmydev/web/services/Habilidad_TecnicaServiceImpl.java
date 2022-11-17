package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Habilidad_Tecnica;
import cl.findmydev.web.repositories.Habilidad_TecnicaRepository;



@Service
public class Habilidad_TecnicaServiceImpl implements Habilidad_TecnicaService{
       
	@Autowired
	private Habilidad_TecnicaRepository habilidad_tecnicaRepository;
	
	@Override
	public Habilidad_Tecnica guardarHabilidad_Tecnica(Habilidad_Tecnica habilidad_tecnica) {
		return habilidad_tecnicaRepository.save(habilidad_tecnica);
}
}
