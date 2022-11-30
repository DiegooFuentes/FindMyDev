package cl.findmydev.web.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Table(name="reclutadores")
	
public class Reclutador {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
	
	// @JsonIgnore
		@OneToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "usuario_id") // se crea foreign key
		private Usuario usuario;

	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="datoEmpresa_id")
	private DatoEmpresa datoEmpresa;
	

}
