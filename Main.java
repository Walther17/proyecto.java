package Emisora;

	import java.util.Scanner;


	public class Main {

	    
	    public static void main(String[] args) {
	        Fm ob1 = new Fm();
	        ob1.setMHz(80);
	        Scanner in = new Scanner (System.in);
	        int opcion;
	        do{
	        	System.out.println("1) SUBIR MHz");
	            System.out.println("2) BAJAR Mhz");
	            System.out.println("3) MOSTRAR MHz");
	            System.out.println("4) SALIR");
	            System.out.print("DIGITE LA OPCION QUE DESEA REALIZAR: ");opcion = in.nextInt();
	            switch(opcion){
	                case 1: System.out.println("LA FRECUENCIA SUBIORA EN 0.5"); ob1.up(); ob1.controlador(); break;
	                case 2: System.out.println("LA FRECUENCIA BAJARA EN  0.5");ob1.down(); ob1.controlador(); break;
	                case 3: System.out.println("LA FRECUENCIA ACTUAL ES DE : "+ob1.display()); break;
	                case 4: break;
	                default : System.out.println("LA OPCION NO ESTA DISPONOBLE :( :");
	            }
	            
	        }while(opcion != 4);
	    }
	    
	}


