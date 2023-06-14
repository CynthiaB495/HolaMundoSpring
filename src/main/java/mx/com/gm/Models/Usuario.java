package mx.com.gm.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//indicando que hace referencia a la base de datos 
@Entity 

//entity manager acceda la consulta indicando a que tabla debe dirigirse 
@Table(name = "usuarios") 
@ToString @EqualsAndHashCode

public class Usuario {
	/* se hace el uso de la libreria loombok y por medio de esta se puede eliminar  los getter y 
	 * setters en su lugar de usan estas anotaciones */
	
	@Id   // con esta anotacion indicamos que es  el identificador 
	@Getter @Setter @Column(name = "id")
	private Long id;
	
	@Getter @Setter @Column(name = "nombre")
	private String nombre;
	
	@Getter @Setter @Column(name = "apellido")
	private String apellido;
	
	@Getter @Setter @Column(name = "email")
	private String email;
	
	@Getter @Setter @Column(name = "telefono")
	private String telefono;
	
	@Getter @Setter @Column(name = "password")
	private String password;
}
