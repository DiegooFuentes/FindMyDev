package cl.findmydev.web.services;

import cl.findmydev.web.models.DatoEmpresa;

public interface DatoEmpresaService {

	public DatoEmpresa guardarDatoEmpresa(DatoEmpresa datoEmpresa);

	public String eliminarDatoEmpresa(Long id);

}
