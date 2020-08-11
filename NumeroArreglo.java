
public class NumeroArreglo {

	public static void main(String[] args) {
			int [] numeros = new int[] {
					12,-73,6,8,-4,19,-23,0,187,205
			};
			
			int num = numeros[0];
			int posicion = 0;
			
			for(int i=0; i<numeros.length; i++) {
				if(num<numeros[i]) {
					num=numeros[i];
					posicion = i;
				}
			}
			System.out.println(num);
			System.out.println(posicion);
			

		}

}
