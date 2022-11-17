package com.example.EJ25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EJ25.dao.ICajasDAO;
import com.example.EJ25.dto.Caja;

@Service
public class CajasServiceImpl implements ICajasService {

	@Autowired
	ICajasDAO iCajasDAO;

	@Override
	public List<Caja> listarCajas() {
		return iCajasDAO.findAll();
	}

	@Override
	public Caja crearCaja(Caja caja) {
		return iCajasDAO.save(caja);
	}

	@Override
	public Caja leerCajaByNumReferencia(String numReferencia) {
		List<Caja> aux = iCajasDAO.findAll();
		for (Caja caja : aux) {
			if (caja.getNumReferencia().equals(numReferencia)) {
				return caja;
			}
		}
		return null;
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajasDAO.save(caja);
	}

	@Override
	public void borrarCajaByNumReferencia(String numReferencia) {
		List<Caja> aux = iCajasDAO.findAll();
		for (Caja caja : aux) {
			if (caja.getNumReferencia().equals(numReferencia)) {
				iCajasDAO.delete(caja);
			}
		}
	}

}