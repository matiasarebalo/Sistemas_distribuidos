package com.tp_sd_1.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.tp_sd_1.entities.TipoMedicamento;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Medicamento {

    @Id
    private int id;
    private String codigo;
    private String nombreComercial;
    private String nombreDroga;

	@Column(name = "codVerificador")
	protected int codVerificador;

	@ManyToOne
	@JoinColumn(name = "tipo_medicamento_id_medicamento")
	protected TipoMedicamento tipoMedicamento;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public TipoMedicamento getTipoMedicamento() {
		return tipoMedicamento;
	}


	public Medicamento(String codigo, String nombreComercial, String nombreDroga) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreDroga = nombreDroga;
		setCodVerificador();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCodVerificador() {
		return codVerificador;
	}

	// Suponiendo que el codigo se ingresa en formato String XXX-NNNNN
	// Si se ingresa en formato numerico, habria que realizar la conversion
	public void setCodVerificador() {

		String codNumerico = "";

		try {
			codNumerico = codigo.substring(4, 8);

		} catch (Exception e) {
			System.out.println(e);
		}

		this.codVerificador = calcularCodigoVerificador(codNumerico);
	}

	private int calcularCodigoVerificador(String codNumerico) {

		int suma = -1;

		if (codNumerico != "") {
			suma = 0;

			for (char c: codNumerico.toCharArray()) {
				suma += Integer.parseInt(String.valueOf(c));
			}

			if (suma > 9) {
				calcularCodigoVerificador(Integer.toString(suma));
			}
		}

		return suma;
	}

	public boolean verificar(String codigo) {
		return Integer.parseInt(codigo.substring(codigo.length() - 1)) == calcularCodigoVerificador(codigo);
	}

	public boolean esPrioritario(String codigo) {
		return codigo.toCharArray()[0] == 'P' || codigo.toCharArray()[0] == 'W';
	}

	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + id + ", codigo=" + codigo + ", nombreComercial="
				+ nombreComercial + ", nombreDroga=" + nombreDroga + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
}