package com.server.java.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.java.entities.Medicamento;


public interface IMedicamentoRepository extends JpaRepository<Medicamento, Serializable> {

public abstract Medicamento findById(int id);
	
	
	
	
}
