package DB;

import java.util.ArrayList;

import models.Usuario;

public class UsuarioDB {

	  Usuario _user ;
	  ArrayList<Usuario> ListaUsuarios = new ArrayList<Usuario>(); 
	
  public UsuarioDB() {
	  

	  
  }	
	
  public Usuario CrearUsuarioDB(Usuario i_usuario) {
		
	  _user = new Usuario();
		
	   int listcount = ListaUsuarios.size();
	   
	   _user.setUsuarioId(listcount+1);
	   _user.setNombre(i_usuario.getNombre());
	   _user.setFechaNacimiento(i_usuario.getFechaNacimiento());
	   
	   ListaUsuarios.add(_user);
	   
		return _user;
		
	} 
	
	
	public ArrayList<Usuario> ObtenerUsuariosDB() {
		
			
		return ListaUsuarios;
		
	} 
	
	
}
