
public class SumaVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[5];
		
		numeros[0] =1;
		numeros[1] =30;
		numeros[2] =40;
		numeros[3] =50;
		numeros[4]	=18;
		int[] numeros2 = new int[5];
		
		numeros2[0] =12;
		numeros2[1] =13;
		numeros2[2] =14;
		numeros2[3] =13;
		numeros2[4]	=15;
		System.out.println(numeros.length);
		int Numero = 0, Numeros2=0;
		int sumaNumero = 0, suNumeros =0;
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==0)
				Numero++;
			else if(numeros2[i] >0) {
				Numeros2++;
			
		}
		
		System.out.println(Numero);
		System.out.println(Numeros2);
		
		
		System.out.println("vector1: " + sumaNumero);
		System.out.println("vecto2: " + suNumeros);
			
			
		}
	}

	}
		
	
		
		



