package com.tp_sd_1.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tp_sd_1.entities.TipoMedicamento;
import com.tp_sd_1.repositories.ITipoMedicamentoRepository;
import com.tp_sd_1.services.ITipoMedicamentoService;

@Service("tipoMedicamentoService")
public class TipoMedicamentoService implements ITipoMedicamentoService {

	@Autowired
	@Qualifier("tipoMedicamentoRepository")
	private ITipoMedicamentoRepository tipoMedicamentoRepository;
	
	@Override
	public List<TipoMedicamento> getAll() {
		return tipoMedicamentoRepository.findAll();
	}
	
}
