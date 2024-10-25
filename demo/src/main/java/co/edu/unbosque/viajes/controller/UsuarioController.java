package co.edu.unbosque.viajes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.viajes.persistence.Usuario;
import co.edu.unbosque.viajes.repository.UsuarioRepository;
import jakarta.transaction.Transactional;

@Transactional
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usrep;
	
	@GetMapping("/login")
	public ResponseEntity<String> iniciarSesion(@RequestParam String correo, @RequestParam String contraseña){
		
		Optional<Usuario> us = usrep.findByCorreo(correo);
		
		if(us.isPresent()){
			if(us.get().getContraseña().equals(contraseña)) {
				return ResponseEntity.status(HttpStatus.ACCEPTED).body("Inicio correctamente");
			}else {
				return ResponseEntity.status(HttpStatus.ACCEPTED).body("Correo o contraseña incorrectos");
			}
		}
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Correo o contraseña incorrectos");
		
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<String> resgistrarUsuario(@RequestParam String nombre, @RequestParam Integer telefono, @RequestParam String correo,
			@RequestParam String contraseña){
		
		Usuario nuevo = new Usuario();
		
		nuevo.setNombre(nombre);
		nuevo.setCorreo(correo);
		nuevo.setContraseña(contraseña);
		nuevo.setTelefono(telefono);
		
		usrep.save(nuevo);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Registro exitoso");
		
	}
	
}
