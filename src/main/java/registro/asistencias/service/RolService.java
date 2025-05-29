package registro.asistencias.service;

import java.util.List;

import registro.asistencias.model.Rol;

public interface RolService {
	List <Rol> buscarTodos();
	Rol buscarPorId(Long id);
	void guardar(Rol rol);
	void borrar(Long id);
	void Editar(Rol rol);
}
