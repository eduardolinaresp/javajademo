package UserService;

import java.util.ArrayList;

import DB.UsuarioDB;
import models.Usuario;

public class UserService {


	UsuarioDB _userdb = new UsuarioDB();
	
	public ArrayList<Usuario> ObtenerUsuarios() {
		
			
		
		return _userdb.ObtenerUsuariosDB();
				
	}
	
  public Usuario CrearUsuario(Usuario i_usuario) {
			     
	  
		
		return _userdb.CrearUsuarioDB(i_usuario);
				
	}
	
}
