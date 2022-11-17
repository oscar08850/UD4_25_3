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

import com.example.EJ25.dto.Caja;
import com.example.EJ25.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorCajas {

	@Autowired
	CajasServiceImpl cajasServiceImpl;

	@GetMapping("/cajas")
	public List<Caja> listarEmpleados() {
		return cajasServiceImpl.listarCajas();
	}

	@PostMapping("/cajas")
	public Caja crearCaja(@RequestBody Caja caja) {

		return cajasServiceImpl.crearCaja(caja);

	}

	@GetMapping("/cajas/{numReferencia}")
	public Caja leerCaja(@PathVariable(name = "dni") String numReferencia) {

		Caja caja = new Caja();

		caja = cajasServiceImpl.leerCajaByNumReferencia(numReferencia);

		System.out.println("Empleado con ese dni es: " + caja);
		return caja;
	}

	@PutMapping("/cajas/{numReferencia}")
	public Caja actualizarEmpleado(@PathVariable(name = "numReferencia") String numReferencia, @RequestBody Caja caja) {

		Caja caja_seleccionado = new Caja();
		Caja empleado_actualizado = new Caja();

		caja_seleccionado = cajasServiceImpl.leerCajaByNumReferencia(numReferencia);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen_id(caja.getAlmacen_id());

		empleado_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);

		System.out.println("La caja seleccionada es es: " + empleado_actualizado);

		return empleado_actualizado;
	}

	@DeleteMapping("/cajas/{numReferencia}")
	public void borrarEmpleado(@PathVariable(name = "numReferencia") String numReferencia) {
		cajasServiceImpl.borrarCajaByNumReferencia(numReferencia);
	}

}