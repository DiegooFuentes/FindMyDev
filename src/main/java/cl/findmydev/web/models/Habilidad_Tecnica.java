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
@Table(name="Habilidades_Tecnicas")
public class Habilidad_Tecnica {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id; 
	
	@NotNull
	private String nombre;
	
	private String descripcion;
	
	private int valoracion;
	

	 @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;

	    
		public Habilidad_Tecnica() {
			super();
		}


		public Habilidad_Tecnica(long id, @NotNull String nombre, String descripcion, int valoracion, Date createdAt,
				Date updatedAt) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.valoracion = valoracion;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
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


		public int getValoracion() {
			return valoracion;
		}


		public void setValoracion(int valoracion) {
			this.valoracion = valoracion;
		}


		public Date getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		public Date getUpdatedAt() {
			return updatedAt;
		}


		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
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
