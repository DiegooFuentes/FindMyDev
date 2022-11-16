package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Academica;
import cl.findmydev.web.repositories.AcademicaRepository;

@Service
public class AcademicaServiceImpl implements AcademicaService {

	@Autowired
	private AcademicaRepository academicaRepository;

	@Override
	public Academica guardarAcademica(Academica academica) {
		return academicaRepository.save(academica);
}
}
