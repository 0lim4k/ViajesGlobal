package co.edu.unbosque.viajes.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="paquetes")
public class Paquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paquete")
	Integer id;
	
	String nombre;
	
	String descripcion;

	Double precio;
	
	String destino;
	
	Integer hotel_id;
	
	Integer vuelos_id;
	
	Integer actividades_id;
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(Integer hotel_id) {
		this.hotel_id = hotel_id;
	}

	public Integer getVuelos_id() {
		return vuelos_id;
	}

	public void setVuelos_id(Integer vuelos_id) {
		this.vuelos_id = vuelos_id;
	}

	public Integer getActividades_id() {
		return actividades_id;
	}

	public void setActividades_id(Integer actividades_id) {
		this.actividades_id = actividades_id;
	}

	
}