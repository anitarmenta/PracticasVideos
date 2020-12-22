package video22;

import javax.swing.*;

public class Correo_Verificacion {

		public static void main(String[] args) {
			
			int arroba = 0;
			
			boolean punto = false;
			
			String mail = JOptionPane.showInputDialog("Introduce una direccion de correo electronico");
			
			for (int i=0; i < mail.length(); i++) {
				
				if (mail.charAt(i)=='@') {
					
					arroba++;
				}
				
				if (mail.charAt(i)=='.') {
					
					punto = true;
				}
			}
			if (arroba == 1 && punto == true) {
				System.out.println("La direccion electronica es correcta");
			}
			else {
				System.out.println("Verifica la direccion. No es correcta");
			}
		}

	}
