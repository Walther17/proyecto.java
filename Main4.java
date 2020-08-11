package Tienda;

public class Main4 {

	public static void main(String[] args) {

		Libros lbr1 = new Libros("La piedra Filosofal", 25);
		Libros lbr2 = new Libros("Metamorfosis", 23);
		
		Cd Cd1 = new Cd("Alone", 10);
		Cd Cd2 = new Cd("Happier", 12);

       
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE HARRY POTTER:" + lbr1.getValor1() +  "$");
		System.out.println("EL LIBRO METAMORFOSIS CUESTA : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL VALOR DEL CD DE ALONE ES :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD DE HAPPIER ES : "  + Cd2.getValorcd1() +  "$");
	}

}
