package video19;

import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while (numero != aleatorio) {
			
			intentos ++;
			
			System.out.println("Introduce un numero, por favor");
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				
				System.out.println("El numero que debes encontrar es mas bajito");
				
			}
			else if (aleatorio > numero) {
				System.out.println("El numero que debes encontrar es mas alto");
			}
		}
		
		System.out.println("Adivinaste! Lo has conseguido en " + intentos + " intentos.");

	}

}