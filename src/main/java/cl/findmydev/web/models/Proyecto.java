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
@Table(name="proyectos")
public class Proyecto {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
	
	@NotNull
	@Size(min=3, max=40, message="error en el ingreso del nombre")
	private String nombre;
	
	private  String descripcion;
	
	private String foto;
	
	private String url;
	
	 @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    

	
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
