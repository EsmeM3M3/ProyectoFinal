package registro.asistencias.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import registro.asistencias.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Integer>{

}
