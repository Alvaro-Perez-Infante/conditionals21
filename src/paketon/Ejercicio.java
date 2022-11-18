package paketon;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 
		
		
		final String GANA1 = "Gana el jugador 1";
		final String GANA2 = "Gana el jugador 2";
		final String EMPATE = "EMPATE";
		
		
		
		String resp1;
		String resp2;
		String resultado = null;
		
		
		do {
			System.out.println("JUGADOR 1 (Piedra/Papel/Tijeras): ");
			resp1 = teclado.nextLine();
			System.out.println("JUGADOR 2 (Piedra/Papel/Tijeras): ");
			resp2 = teclado.nextLine();
			
			if (resp1.equals("Piedra")) {
				switch(resp2) {
				case "Piedra" : resultado = EMPATE; break;
				case "Papel" : resultado = GANA2; break;
				case "Tijeras" : resultado = GANA1; break;
				}
				
			}else {
				if (resp1.equals("Papel")) {
					switch(resp2) {
					case "Piedra" : resultado = EMPATE; break;
					case "Papel" : resultado = GANA2; break;
					case "Tijeras" : resultado = GANA1; break;
				}
					
					}else {
						switch(resp2) {
						case "Piedra" : resultado = EMPATE; break;
						case "Papel" : resultado = GANA2; break;
						case "Tijeras" : resultado = GANA1; break;
						}
					}
				
				
			}
			
			
			
			
			System.out.println(resultado);
		}while(true);
		
	}

}