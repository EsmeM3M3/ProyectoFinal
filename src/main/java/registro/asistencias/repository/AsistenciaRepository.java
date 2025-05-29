package registro.asistencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import registro.asistencias.model.Asistencia;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer>{

}
