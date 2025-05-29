package registro.asistencias.service;

import java.util.List;

import registro.asistencias.model.Asistencia;

public interface AsistenciaService {
	List <Asistencia> buscarTodos();
	Asistencia buscarPorId(Integer id);
	void guardarAsistencia(Asistencia asis);
	void borrarAsistencia(Integer id);
	void EditarAsistencia(Asistencia asis);
}
