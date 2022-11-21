package cl.findmydev.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.findmydev.web.models.DatoEmpresa;
import cl.findmydev.web.repositories.DatoContactoRepository;
import cl.findmydev.web.repositories.DatoEmpresaRepository;

@Service
public class DatoEmpresaServiceImpl implements DatoEmpresaService {

	@Autowired
	private DatoEmpresaRepository datoEmpresaRepository;

	@Override
	public DatoEmpresa guardarDatoEmpresa(DatoEmpresa datoEmpresa) {
		return datoEmpresaRepository.save(datoEmpresa);
	}

	@Override
	public  String eliminarDatoEmpresa(Long id) {
	Boolean existe = datoEmpresaRepository.existsById(id);
	
	if(existe) {
		
		datoEmpresaRepository.deleteById(id);;
	}		
	
	else { return "no se encuentra"; }
	
	
	existe= datoEmpresaRepository.existsById(id);
	
if(existe) {
		
		return "error" ;
	}		
	
return "borrado exitosamente";

	}
	
	
	
	

}