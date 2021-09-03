package com.tp_sd_1.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tp_sd_1.entities.Medicamento;

@Repository("medicamentoRepository")
public interface IMedicamentoRepository extends JpaRepository<Medicamento, Serializable> {

	public abstract Medicamento findByNombreComercial(String nombreComercial);

	@Query(value = "SELECT * FROM medicamento m WHERE m.tipo_medicamento_id_medicamento = (:idTipo)", nativeQuery = true)
    List<Medicamento> buscarPorTipo(@Param("idTipo") int idTipo);

	@Query(value = "SELECT * FROM medicamento m WHERE m.nombreComercial LIKE '(:letra)%'", nativeQuery = true)
    List<Medicamento> buscarPorInicio(@Param("letra") char letra);
}
