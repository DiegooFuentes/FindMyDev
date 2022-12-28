package cl.findmydev.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "postulantes")
public class Postulante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	//@JsonIgnore
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_Id") // se crea foreign key
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "proyecto_id")
	private Proyecto proyecto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="academica_id")
	private Academica academica;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="laboral_id")
	private Laboral laboral;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contacto_id")
	private DatoContacto datoContacto;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="habilidadestec_postulantes",//nombre de la tabla relacional 
			joinColumns = @JoinColumn(name="postulante_id"),
			inverseJoinColumns = @JoinColumn(name="habilidadtec_id")
			)
	private List<Habilidad_Tecnica> habilidad_tecnica;
	
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="habilidadesblandas_postulantes",//nombre de la tabla relacional 
			joinColumns = @JoinColumn(name="postulante_id"),
			inverseJoinColumns = @JoinColumn(name="habilidadblanda_id")
			)
	private List<Habilidad_Blanda> habilidad_blanda;

	

	
	

	

	
	
	
	


}
