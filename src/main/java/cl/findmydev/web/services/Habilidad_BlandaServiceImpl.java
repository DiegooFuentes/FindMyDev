package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Habilidad_Blanda;
import cl.findmydev.web.repositories.Habilidad_BlandaRepository;

@Service
public class Habilidad_BlandaServiceImpl implements Habilidad_BlandaService {
	
	@Autowired
	private Habilidad_BlandaRepository habilidad_BlandaRepository;
	
	@Override
	public Habilidad_Blanda guardarHabilidad_Blanda(Habilidad_Blanda habilidad_Blanda) {
		return habilidad_BlandaRepository.save(habilidad_Blanda);
	}
	}
