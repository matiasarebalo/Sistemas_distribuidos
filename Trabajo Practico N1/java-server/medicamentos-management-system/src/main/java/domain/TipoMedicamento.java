
package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@ToString
@Entity
public class TipoMedicamento {

    @Id
    private int id;
    private String nombre;
    private boolean activo;
    
	public TipoMedicamento() {
		super();
	}

	public TipoMedicamento(int id, String nombre, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}