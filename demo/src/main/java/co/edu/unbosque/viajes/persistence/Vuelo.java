package co.edu.unbosque.viajes.persistence;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(columnDefinition = "VARCHAR(50)", name = "lugar_origen")
	private Double lugarOrigen;
	
	@Column(columnDefinition = "VARCHAR(50)", name = "lugar_destino")
	private Double lugarDestino;
	
	@Column(name = "fecha_salida")
	private Date fechaSalida;
	
	@Column(name = "fecha_llegada")
	private Date fechaLlegada;
	
	@Column(columnDefinition = "VARCHAR(100)")
	private String aerolinea;
	
	@Column(columnDefinition = "DECIMAL(10,2)")
	private Double precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getLugarOrigen() {
		return lugarOrigen;
	}

	public void setLugarOrigen(Double lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}

	public Double getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(Double lugarDestino) {
		this.lugarDestino = lugarDestino;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
