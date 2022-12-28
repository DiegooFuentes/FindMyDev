package cl.findmydev.web.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="roles")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor  
@ToString
public class Rol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String descripcion;

	
	//Relacion ManyToMany // es lo mismo que tener dos relacions ManyToOne
		//mappedBy significa que es el nombre de la ruta con el cual nos van a buscar y encontrar
	/*	@JsonIgnore
		@ManyToMany(mappedBy="roles",fetch = FetchType.LAZY)
		private List<Usuario> usuarios;
	*/
	
	@OneToMany(mappedBy = "rol",cascade = CascadeType.ALL,fetch = FetchType.LAZY)// quien no se queda con la FK Le agregamosel mappedbt,cascade y fetch
	private List<Usuario> usuarios;
  

}
