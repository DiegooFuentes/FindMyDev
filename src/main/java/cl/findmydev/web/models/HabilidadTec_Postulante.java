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
import javax.persistence.ManyToOne;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="habilidadestec_postulantes")
public class HabilidadTec_Postulante {
      
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer valoracion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="habilidadtec_id")
	private Habilidad_Tecnica habilidad_tecnica;
	//2 ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="postulante_id")
	private Postulante postulante;
	
	
	
	
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
