package com.example.EJ25.service;

import java.util.List;

import com.example.EJ25.dto.Almacenes;

public interface IAlmacenesService {

	// Metodos del CRUD

	public List<Almacenes> listarAlmacenes(); // Listar All

	public Almacenes crearAlmacen(Almacenes almacen); // CREATE

	public Almacenes leerAlmacenById(Long id); // READ

	public Almacenes actualizarAlmacen(Almacenes almacen); // UPDATE

	public void borrarAlmacen(Long id);// DELETE

}