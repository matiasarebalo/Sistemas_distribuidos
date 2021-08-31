package com.tp_sd_1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp_sd_1.entities.Medicamento;
import com.tp_sd_1.entities.TipoMedicamento;
import com.tp_sd_1.services.IMedicamentoService;
import com.tp_sd_1.services.ITipoMedicamentoService;

@RestController
public class IndexController {

	@Autowired
	@Qualifier("medicamentoService")
	private IMedicamentoService medicamentoService;
	
	@Autowired
	@Qualifier("tipoMedicamentoService")
	private ITipoMedicamentoService tipoMedicamentoService;

	@RequestMapping("/medicamentos")  
	@ResponseBody
	public ResponseEntity<List<Medicamento>> indexMedicamentos() {
		
		medicamentoService.getAll().forEach((m)-> {
			System.out.println(m);
		});
		
		return ResponseEntity.ok(medicamentoService.getAll());
	}
	
	@RequestMapping("/tipo/medicamento")  
	@ResponseBody
	public ResponseEntity<List<TipoMedicamento>> indextiposMedicamentos() {
		
		tipoMedicamentoService.getAll().forEach((t)-> {
			System.out.println(t);
		});
		
		return ResponseEntity.ok(tipoMedicamentoService.getAll());
	}

}
