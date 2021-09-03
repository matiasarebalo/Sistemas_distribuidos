package com.tp_sd_1.services;

import java.util.List;

import com.tp_sd_1.entities.Medicamento;

public interface IMedicamentoService {
	
	public List<Medicamento> getAll();
	List<Medicamento> buscarPorTipo(int idTipo);
	List<Medicamento> buscarInicio(char letra);
}
