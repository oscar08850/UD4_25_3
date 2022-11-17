package com.example.EJ25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EJ25.dao.IAlmacenesDAO;
import com.example.EJ25.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;

	@Override
	public List<Almacenes> listarAlmacenes() {
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes crearAlmacen(Almacenes almacen) {
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes leerAlmacenById(Long id) {
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void borrarAlmacen(Long id) {
		iAlmacenesDAO.deleteById(id);
	}

}