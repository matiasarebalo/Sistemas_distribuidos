package com.tp_sd_1.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
public class TipoMedicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long idMedicamento;

	@Column(name = "nombre")
	protected String nombre;

	@Value("false")
	@Column(name = "baja")
	protected boolean baja;

	public TipoMedicamento() {
		super();
	}

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public TipoMedicamento(long idMedicamento, String nombre) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombre = nombre;
	}

	public long getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
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
		return "TipoMedicamento [idMedicamento=" + idMedicamento + ", nombre=" + nombre + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}