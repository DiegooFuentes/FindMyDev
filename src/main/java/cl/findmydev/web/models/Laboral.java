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
	
	// --------- MEtodo
	
	
	 @PrePersist
	    protected void onCreate(){
	        this.fechaInicio = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.fechaTermino = new Date();
	    }
}
