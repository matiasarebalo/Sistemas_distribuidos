package com.tp_sd_1.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp_sd_1.entities.Medicamento;

@Repository("medicamentoRepository")
public interface IMedicamentoRepository extends JpaRepository<Medicamento, Serializable> {

	public abstract Medicamento findByNombreComercial(String nombreComercial);
	
}
