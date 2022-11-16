package cl.findmydev.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "datoscontacto")
public class DatoContacto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String correo;
	
	private Long telefono;
	
	private String github;
	
	private String portafolio;
	
	@Column(updatable = false) 
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt; 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt; 

	public DatoContacto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(String portafolio) {
		this.portafolio = portafolio;
	}
	
	@PrePersist 
	protected void onCreate(){
	     this.createdAt = new Date(); 
	}
	    
	@PreUpdate  
	protected void onUpdate(){
	     this.updatedAt = new Date();
	}


}
