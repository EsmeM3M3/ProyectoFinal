package registro.asistencias.service;

import java.util.List;

import registro.asistencias.model.Puesto;

public interface PuestoService {
	List <Puesto> buscarTodos();
	Puesto buscarPorId(Integer id);
	void guardarPuesto(Puesto puesto);
	void borrarPuesto(Integer id);
	void EditarPuesto(Puesto puesto);
}
