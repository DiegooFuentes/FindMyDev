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
@Table(name="laborales")
public class Laboral {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull 
	private String nombre;
	
	@Column(updatable= false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaInicio;
	
	@Column(updatable= false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechaTermino;
	
	@NotNull
	private String descripcion;

	public Laboral() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	 @PrePersist
	    protected void onCreate(){
	        this.fechaInicio = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.fechaTermino = new Date();
	    }
}
