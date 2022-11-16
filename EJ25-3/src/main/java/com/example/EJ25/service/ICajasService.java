package com.example.EJ25.service;

import java.util.List;

import com.example.EJ25.dto.Caja;


public interface ICajasService {

	// Metodos del CRUD

	public List<Caja> listarCajas(); // Listar All

	public Caja crearCaja(Caja caja); // CREATE

	public Caja leerCajaByNumReferencia(String numReferencia); // READ

	public Caja actualizarCaja(Caja caja); // UPDATE

	public void borrarCajaByNumReferencia(String numReferencia);// DELETE

}