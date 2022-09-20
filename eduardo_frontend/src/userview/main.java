package userview;

import java.util.Date;
import UserService.UserService;
import models.Usuario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService uservice = new UserService();
		
		//;
		
		Date fecha = new Date();
		
		Usuario _usr1 = new Usuario();
		Usuario _usr2 = new Usuario();
		
		_usr1.setNombre("Primer Usuario");
		_usr1.setFechaNacimiento(fecha);
		
		uservice.CrearUsuario(_usr1);
		
		_usr2.setNombre("Segundo usuario");
		_usr2.setFechaNacimiento(fecha);
		
		uservice.CrearUsuario(_usr2);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < uservice.ObtenerUsuarios().size(); i++) {
	
			sb.append("\n");
			sb.append("ID:");
			sb.append(uservice.ObtenerUsuarios().get(i).getUsuarioId());
			sb.append("\n");
			sb.append("Nombre: ");
			sb.append(uservice.ObtenerUsuarios().get(i).getNombre());
			sb.append("\n");
			sb.append("Fecha Nacimiento: ");
			sb.append("\n");
			sb.append(uservice.ObtenerUsuarios().get(i).getFechaNacimiento());
			
			
			System.out.print(sb.toString());
			sb.setLength(0);
           
		}
		
		

	}

}
