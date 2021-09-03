package com.tp_sd_1.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp_sd_1.entities.TipoMedicamento;

@Repository("tipoMedicamentoRepository")
public interface ITipoMedicamentoRepository extends JpaRepository<TipoMedicamento, Serializable> {

	public abstract TipoMedicamento findByNombre(String nombre);

}
