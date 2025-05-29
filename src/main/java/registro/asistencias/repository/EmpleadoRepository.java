package registro.asistencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import registro.asistencias.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

}
