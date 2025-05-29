package registro.asistencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registro.asistencias.model.Retardos;

public interface RetardosRepository extends JpaRepository<Retardos, Integer>{
}
