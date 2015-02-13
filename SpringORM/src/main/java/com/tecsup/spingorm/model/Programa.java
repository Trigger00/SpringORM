package com.tecsup.spingorm.model;

//libreria de jpa, tiene como extencion javax

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Programa")
public class Programa implements Serializable {
	@SequenceGenerator(name = "LOG_ID_SEQ", sequenceName = "LOG_ID_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_SEQ")
	@Column(name = "id")
	private Long id;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "codigo")
	private String codigo;

	public Programa() {
	}

	public Programa(Long id) {
		this.id = id;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
