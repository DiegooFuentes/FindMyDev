package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.Proyecto;
import cl.findmydev.web.repositories.ProyectoRepository;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	@Autowired
	private ProyectoRepository proyectoRepository;
	
	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
}
}
