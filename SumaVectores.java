
public class SumaVectores {
	
	public static void main (String[] args) {
		int vector1 [] =   {12,3,4,5,18};
		int suma1 = 0;
		
		int vector2 [] =   {8,4,6,88,1};
		int suma2 = 0;
		
		for(int i = 0; i<vector1.length;i++) {
			suma1 += suma2 + vector1[i];
			}
		for(int i = 0; i<vector2.length;i++) {	
			suma2 += vector2[i];
		}
		if (suma1 > suma2) {
			System.out.println("Vector 1 es mayor" + suma1);
		} else if (suma2 > suma1) {
			System.out.println("Vector 2 es mayor" + suma2);
		} else {
			System.out.println("Los vectores son iguales" );	
		}
	
	}
	   

}
