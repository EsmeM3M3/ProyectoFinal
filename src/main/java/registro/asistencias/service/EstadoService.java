package registro.asistencias.service;

import java.util.List;

import registro.asistencias.model.Estado;

public interface EstadoService {
	List <Estado> buscarTodos();
	Estado buscarPorId(Integer id);
	void guardarEstado(Estado es);
	void borrarEstado(Integer id);
	void EditarEstado(Estado es);
}
