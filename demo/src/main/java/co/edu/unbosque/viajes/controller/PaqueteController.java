package co.edu.unbosque.viajes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.viajes.persistence.Paquete;
import co.edu.unbosque.viajes.repository.PaqueteRepository;
import jakarta.transaction.Transactional;

@Transactional
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/paquetes")
public class PaqueteController {
	
	@Autowired
	private PaqueteRepository parep;
	
	@GetMapping("/busqueda")
	public ResponseEntity<List<Paquete>> buscarPaquetes(@RequestParam(required = false) String busqueda, 
			@RequestParam(required = false, defaultValue = "0") Double filtroPrecioMin, 
			@RequestParam(required = false, defaultValue = "10000") Double filtroPrecioMax, 
			@RequestParam(required = false) String origen, 
			@RequestParam(required = false) String destino){
		
		List<Paquete> list = parep.findByDescripcionContainingAndOrigenAndDestinoAndPrecioBetween(busqueda, origen, destino, filtroPrecioMin, filtroPrecioMax);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(list);
		
	}

}
