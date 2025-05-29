package registro.asistencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import registro.asistencias.model.Empleado;
import registro.asistencias.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Integer>{
	Horario findByEmpleado(Empleado empleado);
}
