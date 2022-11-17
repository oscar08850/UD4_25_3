package com.example.EJ25.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EJ25.dto.Almacenes;
import com.example.EJ25.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorAlmacenes {

	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;

	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes() {
		return almacenesServiceImpl.listarAlmacenes();
	}

	@PostMapping("/almacenes")
	public Almacenes crearAlmacenes(@RequestBody Almacenes almacenes) {

		return almacenesServiceImpl.crearAlmacen(almacenes);

	}

	@GetMapping("/almacenes/{id}")
	public Almacenes leerAlmacenes(@PathVariable(name = "id") Long id) {

		Almacenes almacenes = new Almacenes();
		
		almacenes = almacenesServiceImpl.leerAlmacenById(id);

		System.out.println("Almacen segun ID: " + almacenes);

		return almacenes;
	}

	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacenes(@PathVariable(name = "id") Long id,
			@RequestBody Almacenes almacenes) {

		Almacenes almacenes_seleccionado = new Almacenes();
		Almacenes almacenes_actualizado = new Almacenes();

		almacenes_seleccionado = almacenesServiceImpl.leerAlmacenById(id);

		almacenes_seleccionado.setLugar(almacenes.getLugar());
		almacenes_seleccionado.setCapacidad(almacenes.getCapacidad());

		almacenes_actualizado = almacenesServiceImpl.actualizarAlmacen(almacenes_seleccionado);

		System.out.println("El departamento actualizado es: " + almacenes_actualizado);

		return almacenes_actualizado;
	}

	@DeleteMapping("/almacenes/{id}")
	public void borrarAlmacen(@PathVariable(name = "id") Long id) {
		almacenesServiceImpl.borrarAlmacen(id);
	}

}