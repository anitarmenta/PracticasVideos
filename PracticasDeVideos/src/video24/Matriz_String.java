package video24;

import javax.swing.*;

public class Matriz_String {

	public static void main(String[] args) {
		
		//String [] paises = {"Venezuela", "Colombia", "Suiza", "Francia", "Estados Unidos", "Espana", "Belgica"};
				
		String paises [] = new String[8];
		
		/*paises[0] = "Venezuela";
		paises[1] = "Colombia";
		paises[2] = "Francia";
		paises[3] = "Suiza";
		paises[4] = "EEUU";
		paises[5] = "Espana";
		paises[6] = "Belgica";
		paises[7] = "Alemania";*/
		
		for (int i = 0; i<paises.length; i++) {
			
			paises[i] = JOptionPane.showInputDialog("Escribe un pais "+ (i+1));
		}
		
		for(String pais:paises) {
			
			System.out.println("Pais : " +pais);
		}

	}

}
