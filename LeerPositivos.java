import java.util.Scanner;

public class LeerPositivos {

	public static void main(String[] args) {
		
				Scanner in = new Scanner(System.in);
				int i=0;
				while (i<5) {
					System.out.println("leer numero(" +i +"): ");
					int numero = in.nextInt();
					if(numero>0)
						System.out.println("Numero: " + numero);
					i++;
				}	
 		
				
				
				//CicloFor
				/*
				for(int i =0;1<5; i++) {
				   System.out.println("Leer Numero("+ i +"):");
				   Scanner in = new Scanner(System.in);
				   int numero = in.nextInt();
				   if(numero>0)
				     System.out.println("Numero:" + numero);
				     
				 }
				 */

	}

}
