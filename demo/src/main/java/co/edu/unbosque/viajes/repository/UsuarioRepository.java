package co.edu.unbosque.viajes.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.viajes.persistence.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	public Optional<Usuario> findByCorreo(String correo);
	
}
