package com.server.java.services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.java.repositories.ITipoMedicamentoRepository;
import com.server.java.services.ITipoMedicamentoService;

@Service("tipoMedicamentoService")
public class TipoMedicamentoService implements ITipoMedicamentoService {

	@Autowired
	private ITipoMedicamentoRepository	tipoMedicamentoRepository;
	
	
	
}
