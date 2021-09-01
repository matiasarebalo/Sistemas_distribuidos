package com.tp_sd_1.entities;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long idMedicamento;

	@Column(name = "codigo")
	protected String codigo;

	@Column(name = "nombreComercial ")
	protected String nombreComercial;

	@Column(name = "nombreDroga")
	protected String nombreDroga;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	Medicamento() {
	}

	public Medicamento(String codigo, String nombreComercial, String nombreDroga) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreDroga = nombreDroga;
	}

	public long getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreDroga() {
		return nombreDroga;
	}

	public void setNombreDroga(String nombreDroga) {
		this.nombreDroga = nombreDroga;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", codigo=" + codigo + ", nombreComercial="
				+ nombreComercial + ", nombreDroga=" + nombreDroga + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}

}
