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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="proyectos")
public class Proyecto {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
	
	@NotNull
	@Size(min=3, max=15, message="error en el ingreso del nombre")
	private String nombre;
	
	private  String descripcion;
	
	private String foto;
	
	private String url;
	
	 @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    

	public Proyecto() {
		super();
	}

	public Proyecto(Long id,
			@NotNull @Size(min = 3, max = 15, message = "error en el ingreso del nombre") String nombre,
			String descripcion, String foto, String url) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	// agregar a la columna la fecha antes de insertar
		 @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		 
		 
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
}
