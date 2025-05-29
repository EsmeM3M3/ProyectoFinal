package registro.asistencias.service;

import java.util.List;


import registro.asistencias.model.Permiso;

public interface PermisoService {
	List <Permiso> buscarTodos();
	Permiso buscarPorId(Integer id);
	void guardarPermiso(Permiso per);
	void borrarPermiso(Integer id);
	void EditarPermiso(Permiso per);
}
