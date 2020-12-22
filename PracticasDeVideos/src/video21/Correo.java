package video21;

import javax.swing.JOptionPane;

public class Correo {

	public static void main(String[] args) {
		
		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce una direccion de correo electronico");
		
		for (int i=0; i < mail.length(); i++) {
			
			if (mail.charAt(i)=='@') {
				
				arroba = true;
			}
		}
		if (arroba == true) {
			System.out.println("La direccion electronica es correcta");
		}
		else {
			System.out.println("Verifica la direccion. No es correcta");
		}
	}

}
