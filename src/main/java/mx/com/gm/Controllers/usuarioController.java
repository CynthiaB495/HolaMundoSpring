package mx.com.gm.Controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gm.Models.Usuario;

@RestController // manejan las URL
public class usuarioController {

	@RequestMapping(value = "usuario/{id}") // esto es para que acceda al usuario
	//a travez del id de forma dinamica 

	public Usuario getUsuario(@PathVariable Long id ) {
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");
		
		
		return usuario;

	}
	
	@RequestMapping(value = "usuarios") 
	public List<Usuario> getUsuarios() {
		// creamos un usuario para que lo pueda mostrar
		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario = new Usuario();
		usuario.setId(1624932L);
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(1624933L);
		usuario2.setNombre("Mari0");
		usuario2.setApellido("Carmona");
		usuario2.setEmail("mario_car@hotmail.com");
		usuario2.setTelefono("9948938434");
		
		Usuario usuario3 = new Usuario();
		usuario3.setId(1624934l);
		usuario3.setNombre("Daniela");
		usuario3.setApellido("Carmona");
		usuario3.setEmail("Dani_car@hotmail.com");
		usuario3.setTelefono("8237488434");
		
		usuarios.add(usuario);
		usuarios.add(usuario2);
		usuarios.add(usuario3);


		return usuarios;

	}
	
	@RequestMapping(value = "usuario123")
	// metodo para editar el usuario
	public Usuario Modificar() {
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");

		return usuario;

	}
	@RequestMapping(value = "usuario645")
	//Metodo para Eliminar 
	public Usuario Eliminar(){
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");
		
		return usuario;
		
	}
	@RequestMapping(value = "usuario789")
	//metodo para buscar a un usuario 
	public Usuario Buscar(){
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");
		
		return usuario;
		
	}

}
