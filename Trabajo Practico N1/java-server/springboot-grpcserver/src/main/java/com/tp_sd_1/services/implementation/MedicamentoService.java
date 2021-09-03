package com.tp_sd_1.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tp_sd_1.entities.Medicamento;
import com.tp_sd_1.repositories.IMedicamentoRepository;
import com.tp_sd_1.services.IMedicamentoService;

@Service("medicamentoService")
public class MedicamentoService implements IMedicamentoService {

	@Autowired
	@Qualifier("medicamentoRepository")
	private IMedicamentoRepository medicamentoRepository;
	
	@Override
	public List<Medicamento> getAll() {
		return medicamentoRepository.findAll();
	}

	@Override
	public List<Medicamento> buscarPorTipo(int idTipo) {
		return medicamentoRepository.buscarPorTipo(idTipo);
	}

	@Override
	public List<Medicamento> buscarInicio(char letra) {
		return medicamentoRepository.buscarPorInicio(letra);
	}
}