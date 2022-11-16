package com.example.EJ25.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes") // Nombre de la tabla

public class Almacenes {

	// Atributos de la entidad Departamentos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lugar;
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "cajas_id")
	private List<Caja> cajas;

	// Constructores

	public Almacenes() {
	}

	public Almacenes(Long id, String nombre, int presupuesto, List<Caja> cajas) {
		this.id = id;
		this.lugar = nombre;
		this.capacidad = presupuesto;
		this.cajas = cajas;
	}

	// Setters y getters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Caja> getCajas() {
		return cajas;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajas_id")
	public List<Caja> getCajas_id() {
		return cajas;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "]";
	}

}