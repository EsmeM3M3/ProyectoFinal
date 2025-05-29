package registro.asistencias.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import registro.asistencias.dto.UsuarioRegistroDto;
import registro.asistencias.model.Usuario;

public interface UsuarioService extends UserDetailsService{
	public Usuario guardarUsuario(UsuarioRegistroDto registroDto);
	
	List <Usuario> buscarTodos();
	Usuario buscarPorId(Long id);
	void borrar(Long id);
	void Editar(Usuario us);
}
