
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    private String tipo;
    
	public Medicamento() {
		super();
	}

	public Medicamento(int id, String codigo, String nombreComercial, String nombreDroga, String tipo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreDroga = nombreDroga;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

}