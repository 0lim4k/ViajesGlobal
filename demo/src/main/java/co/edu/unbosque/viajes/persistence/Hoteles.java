package co.edu.unbosque.viajes.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hoteles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String nombre;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String ubicacaion;
	
	private Integer estrellas;
	
	@Column(name = "precio_por_noche")
	private Double precioNoche;
	
	private Integer disponibilidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacaion() {
		return ubicacaion;
	}

	public void setUbicacaion(String ubicacaion) {
		this.ubicacaion = ubicacaion;
	}

	public Integer getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}

	public Double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(Double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public Integer getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Integer disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
