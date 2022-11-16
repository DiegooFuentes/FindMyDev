package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Laboral;
import cl.findmydev.web.repositories.LaboralRepository;

@Service
public class LaboralServiceImpl implements LaboralService {

	@Autowired
	private LaboralRepository laboralRepository;

	@Override
	public Laboral guardarLaboral(Laboral laboral) {
		return laboralRepository.save(laboral);
	}

}
