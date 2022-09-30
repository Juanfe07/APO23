import java.util.Scanner;

public class AñoBisiesto {
	
	int año;
	Scanner entrada = new Scanner (System.in);
	
	public void Entradaaño() {
System.out.println ("Programa para determinar si el año es bisiesto");
System.out.print("Dijite el año a estimar");
año = entrada.nextInt();
	}
	
	public void proceso() {
		if ((año % 4 == 0) && (año % 100 !=0 || año % 400 == 0 )) {
			System.out.println (año+ " Es un año bisiesto");
		}else {
			System.out.println (año+ " No es un año bisiesto"); 
		}
	}
	
	public static void main(String [] args) {
		AñoBisiesto fc = new AñoBisiesto();
		fc.Entradaaño();
		fc.proceso();
	}

}
