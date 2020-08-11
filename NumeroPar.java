import java.util.Scanner;
public class NumeroPar {

	public static void main(String[] args) {
		//hayar el numero par
		
		
				int numero; 
				
				System.out.println("Leer Numero");
				Scanner in = new Scanner (System.in); 
				numero = in.nextInt();
				
				if (numero%2==0)  {
					System.out.println("El numero es par");
				} else {
					System.out.println("El numero es impar");
				}
				
			}
	}


