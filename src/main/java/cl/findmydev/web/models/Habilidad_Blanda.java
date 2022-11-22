package cl.findmydev.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity 
@Table(name="habilidades_blandas")
public class Habilidad_Blanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descripcion;
	
	@NotNull
	private String valoracion;
	
	
	

}
