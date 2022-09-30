import java.util.Scanner;
public class CifrasNumeroEntero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		int numero;
		
		System.out.println ("Ingrese el numero entero");
		numero = entrada.nextInt ();
		
		if (numero < 10) {
			System.out.println ("El numero introducido tiene 1 dijito");
		}
		
		else 
			if (numero < 100) {
				System.out.println ("El numero introducido tiene 2 dijitos");
			}
		
			else 
				if (numero < 1000) {
					System.out.println ("El numero introducido tiene 3 dijitos");
				}
		
				else 
					if (numero < 10000) {
						System.out.println ("El numero introducido tiene 4 dijitos");
					}
		
					else 
						if (numero < 100000) {
							System.out.println ("El numero introducido tiene 5 dijitos");
						}
		
						else 
							if (numero < 1000000) {
								System.out.println ("El numero introducido tiene 6 dijitos");
							}
		
	}
}
