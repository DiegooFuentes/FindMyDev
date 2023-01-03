package cl.findmydev.web.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "h_blandas_usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hblanda_usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@PrimaryKeyJoinColumn
	private Long postulante_id;
	
	@PrimaryKeyJoinColumn
	private Long habilidad_blanda_id;
}
