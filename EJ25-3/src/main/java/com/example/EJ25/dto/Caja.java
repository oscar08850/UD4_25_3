package com.example.EJ25.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cajas")

public class Caja {

	// Atributos de la entidad Fabricante
	@Id
	private String numReferencia;
	private String contenido;
	private int valor;
	
	private int almacen;

	@ManyToOne
	@JoinColumn(name = "almacen_id")
	private Almacenes almacen_id;

	// Constructores

	public Caja() {

	}

	public Caja(String numReferencia, String contenido, int valor, int almacen, Almacenes almacen_id) {
		super();
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
		this.almacen_id = almacen_id;
	}

	public String getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getAlmacen() {
		return almacen;
	}

	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}

	public Almacenes getAlmacen_id() {
		return almacen_id;
	}

	public void setAlmacen_id(Almacenes almacen_id) {
		this.almacen_id = almacen_id;
	}

	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + ", almacen_id=" + almacen_id + "]";
	}
	
	
	



}