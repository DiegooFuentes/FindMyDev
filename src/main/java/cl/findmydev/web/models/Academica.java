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

@Entity // convertir en entidad
@Table(name="academicas")
public class Academica {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	@NotNull 
	private String nombre;
	private String descripcion;
	@Column(updatable=false)
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Academica() {
		super();
	}

	public Academica(long id, @NotNull String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//atributos de control
		 @PrePersist //agregar a la columna la fecha antes de insertar
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		 @PreUpdate //actualizar el atributo de created
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }

}
