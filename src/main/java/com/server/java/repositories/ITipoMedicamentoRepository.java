package com.server.java.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.java.entities.TipoMedicamento;


@Repository("tipoMedicamentoRepository")
public interface ITipoMedicamentoRepository extends JpaRepository<TipoMedicamento, Serializable> {
	
public abstract TipoMedicamento findById(int id);
	
	
}
