package net.osgg.crudthymeleaf.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "recetas")
public class Receta {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "recetas_nombre")
	private String nombre;
	
	private UUID foto;


	private String preparacion;
	
	private String dificultad;
	
	private String autor;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public UUID getFoto() {
		return foto;
	}

	public void setFoto(UUID foto) {
		this.foto = foto;
	}	
	
	public String getPreparacion() {
		return preparacion;
	}
	
	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	
	public String getDificultad() {
		return dificultad;
	}
	
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

}
