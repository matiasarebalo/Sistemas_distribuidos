package com.tp_sd_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tp_sd_1.services.IMedicamentoService;

@Controller
@RequestMapping("/test")
public class MedicamentoController {

	@Autowired
	@Qualifier("medicamentoService")
	private IMedicamentoService medicamentoService;

	@GetMapping("")
	public String index() {
		return "hello world";
	}

}
