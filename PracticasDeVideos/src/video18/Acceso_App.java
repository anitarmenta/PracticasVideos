package video18;
import javax.swing.*;

public class Acceso_App {

	public static void main(String[] args) {
		
		String clave = "Manu.0412";
		String password = "";
		
		while(clave.equals(password)==false) {
			
			password = JOptionPane.showInputDialog("Introduce la contrasena por favor");
			
			if (clave.equals(password)==false) {
				System.out.println("Contrasena incorrecta");
			}
		}
		System.out.println("Contrasena correcta. Acceso permitido");
	}

}
