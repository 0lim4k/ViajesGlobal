package co.edu.unbosque.viajes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.viajes.persistence.Paquete;

public interface PaqueteRepository extends CrudRepository<Paquete, Integer>{
	
	public List<Paquete> findAll();
	
	public List<Paquete> findByDescripcionContainingAndOrigenAndDestinoAndPrecioBetween(
			String descricion, String origen, String destino, Double preciomin, Double preciomax);

}
