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
@Table(name="DatosEmpresas")

public class DatoEmpresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String descripcion;

	 @NotNull	
	private String foto;
	 
	 
		@Column(updatable=false)
		@DateTimeFormat(pattern="yyyy-MM-dd")

		private Date createdAt;
		

		@DateTimeFormat(pattern="yyyy-MM-dd")

		private Date updatedAt;


		
		
		public DatoEmpresa() {
			super();
		}




		public DatoEmpresa(Long id, @NotNull String nombre, @NotNull String descripcion, @NotNull String foto) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.foto = foto;
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
		
		
		
		
		//agregar a la columna la fecha antes de insertar 
		// date para mantener registro de fechas 
		 @PrePersist // antes de guardar agrega la fecha 
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		 
		 // insertar en el atributo update o actualizar ese atributo ....
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
		    
		    
		    
		    
		    
		    
		
		
		
		
		
		
		
}
