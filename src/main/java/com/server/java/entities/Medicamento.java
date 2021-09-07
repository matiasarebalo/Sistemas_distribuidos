package com.server.java.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subcategoria")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;
	
	private String droga;
	
	private String codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private TipoMedicamento tipoMedicamento;

	public Medicamento() {

	}

	public Medicamento(int id, String nombre,String codigo,String droga, TipoMedicamento tipoMedicamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.setCodigo(codigo);
		this.setDroga(droga);
		this.tipoMedicamento = tipoMedicamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoMedicamento getTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDroga() {
		return droga;
	}

	public void setDroga(String droga) {
		this.droga = droga;
	}

}
