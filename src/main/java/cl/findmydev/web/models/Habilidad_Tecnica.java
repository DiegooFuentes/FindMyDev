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
@Table(name="Habilidades_Tecnicas")
public class Habilidad_Tecnica {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
	
	@NotNull
	private String nombre;
	
	private String descripcion;
	
	

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
