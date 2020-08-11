
	import java.util.ArrayList;
	import java.util.Scanner;
	import Tienda.Libro;

	public class Main6 {

		
		public static void mostar(ArrayList<Libro> li) {
			System.out.println("inventario");
			for (int i=0;i<li.size();i++) {
				System.out.println(li.get(i));
			}
		}
		  public static void buscarcodigo(ArrayList<Libro> li) {
			Scanner entrada = new Scanner (System.in);
			System.out.println("solicite el codigo del libro: ");
			int codigoingresado = entrada.nextInt();
			for (int i=0;i<li.size();i++) {
				if (codigoingresado == li.get(i).getCodigo()) {
					System.out.println(li.get(i));	
				}
				
			}
		}
		
	       public static void comprarLibro (ArrayList<Libro> li) {
			Scanner entrada = new Scanner (System.in);
			System.out.println("solicite el codigo del libro");
			int codigoingresado = entrada.nextInt();
			int cantidad;
			for (int i=0;i<li.size();i++) {
				if (codigoingresado == li.get(i).getCodigo()) {
					cantidad = li.get(i).getCantidadexistente();
					if(cantidad > 1) {
						cantidad -= 1;
						System.out.println("gracias por preferirnos");
						li.get(i).setCantidadexistente(cantidad);
						actualizar(li);
					}else {
						cantidad = 0;
						System.out.println("gracias por preferirnos");
						System.out.println("el libro que ha solicitado se termino");
						li.get(i).setCantidadexistente(cantidad);
						actualizar(li);
					}
				}
			}
		}
			
		public static void actualizar(ArrayList<Libro> li) {
			
			for (int i=0;i<li.size();i++) {
				System.out.println(li.get(i));
			}
		}
			
		public static void librosMasCaros (ArrayList<Libro> li) {
			System.out.println("ANALIZANDO LIBROS MAS COSTOSOS");
		}
		
		
			public static void main(String[] args) {
				
				ArrayList<Libro> libros = new ArrayList<Libro>();
				
				Libro l1 = new Libro("piedra filosofal", 29.05);
				Libro l2 = new Libro("metamorfosis", 60.15);
				Libro l3 = new Libro(" Tres dias en la luna ",79.68);
				Libro l4 = new Libro(" 100 canciones" , 90.94);
				Libro l5 = new Libro("  pinocho" ,75.99);
				
				
				
				libros.add(l1);
				libros.add(l2);
				libros.add(l3); 
				libros.add(l4);
				libros.add(l5);
			
			}
	}
