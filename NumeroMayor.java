
public class NumeroMayor {

	public static void main(String[] args) {
		int n1 = 75;
		int n2 = 101;
		int n3 = 18;
		

		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + "El primero es mayor");
		} else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + "Segundo es mayor");
		} else {
			System.out.println(n3 + "Este es el mayor");
		}
	}

}
