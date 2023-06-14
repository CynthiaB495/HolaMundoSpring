package mx.com.gm.Dao;

import java.util.List;

import mx.com.gm.Models.Usuario;

 // Una interface es un archivo que define  que funciones debería tener una clase obl
public interface usuarioDao {
	
	List<Usuario>getUsuarios();

	void eliminar(Long id);

	void registrar(Usuario usuario);

}
