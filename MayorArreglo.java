import java.util.Scanner;

public class MayorArreglo {
	
	public static void main(String[] args) {
		
		int numeros [] =   {12,3,4,5,18};
		
		int mayor = numeros[1];

		for(int i = 1; i<numeros.length;i++) {
			if(mayor < numeros[i]) {
				mayor = numeros[i];
			}
			
		}
		System.out.println("El numero mayor es:" + mayor);
	}

}
