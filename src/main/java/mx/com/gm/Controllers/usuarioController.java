package mx.com.gm.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gm.Dao.usuarioDao;
import mx.com.gm.Models.Usuario;

@RestController // manejan las URL

public class usuarioController {

	@Autowired // injeccion de dependencias 
	private usuarioDao usuarioDao;

	@RequestMapping(value = "api/usuarios/{id}" ,method = RequestMethod.GET) // esto es para que acceda al usuario
	// a travez del id de forma dinamica

	public Usuario getUsuario(@PathVariable Long id) {
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");

		return usuario;

	}
	@RequestMapping(value = "api/usuarios/{id}" ,method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {
		
		return usuarioDao.getUsuarios();

	}
	
	@RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
	public void registrarUsuario(@RequestBody Usuario usuario) {
		
		 usuarioDao.registrar(usuario);

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

	@RequestMapping(value = "api/usuarios/{id}" ,method = RequestMethod.DELETE)
	// Metodo para Eliminar
	public void Eliminar(@PathVariable Long id) {
		
		usuarioDao.eliminar(id);

	}

	@RequestMapping(value = "usuario789")
	// metodo para buscar a un usuario
	public Usuario Buscar() {
		// creamos un usuario para que lo pueda mostrar
		Usuario usuario = new Usuario();
		usuario.setNombre("Mariana");
		usuario.setApellido("Carmona");
		usuario.setEmail("mari_car@hotmail.com");
		usuario.setTelefono("8948938434");

		return usuario;

	}

}
