package Tiendaa;

	import java.time.LocalDate;
	import java.time.Month;
	import java.util.Calendar;
	import java.util.Scanner;


	public class Main2 {

	    public static Fecha f1 = new Fecha(15, 07, 2020);
	    public static Scanner in = new Scanner(System.in);
	    
	    public static void definirFecha(){
	        f1.setDia(15);
	        f1.setMes(7);
	        f1.setAnio(2020);
	    }
	    
	    public static void Adelantar(){
	        int diaActual = f1.getDia();
	        int mesActual = f1.getMes();
	        int anioActual = f1.getAnio();
	        
	        Calendar oFecha = Calendar.getInstance();
	        oFecha.set(anioActual, mesActual, diaActual);
	        
	       
	        oFecha.add(Calendar.DAY_OF_MONTH, f1.getDia());
	        oFecha.add(Calendar.MONTH, f1.getMes());
	        oFecha.add(Calendar.YEAR, f1.getAnio());
	        
	        f1.setAnio(oFecha.get(Calendar.YEAR));
	        f1.setMes(oFecha.get(Calendar.MONTH));
	        f1.setDia(oFecha.get(Calendar.DAY_OF_MONTH)+5);
	        
	        
	    }
	    
	    public static String imprimirFecha(){
	        return "\nDia: "+f1.getDia()+
	                "\nMes: "+f1.getMes()+
	                "\nAnio: "+f1.getAnio();
	    }
	    
	    public static void main(String[] args) {
	        
	        Producto p1 = new Producto();
	        
	        LocalDate date = LocalDate.of(2020, 8, 7);
	        LocalDate newDate = date.plusDays(10);
	        
	        
	        char opc = 0;
	        String respuesta;
	        p1.setIVA(0.09f);
	        p1.setPrecio(5.0f);
	        do{
	            System.out.print("INGRESAR EL NOMBRE DEL PRODUCTO: "); p1.setNombreProducto(in.next());
	            
	            System.out.println("GENERANDO CODIGO PARA EL PRODUCTO..");
	            System.out.println("EL CODIGO "+ p1.getNombreProducto()+" ES: "+ p1.codigoProducto());
	            
	            System.out.println("SU FECHA DE ELABORACION  "+ p1.getNombreProducto()+" ES: ");
	             
	            if(opc == 's' || opc == 'S'){
	                System.out.println(newDate);
	            }
	            else{
	                System.out.println(date);
	            }
	            
	            System.out.println("EL PRECIO DEL IVA ES: "+p1.getIVA());
	            
	            System.out.println("MOSTRANDO EL PRECIO:");
	            System.out.println("EL PRECIO SIN IVA "+ p1.getNombreProducto() +" ES: "+p1.getPrecio());
	            System.out.println("EL PRECIO TOTAL "+ p1.getNombreProducto()+" ES: "+p1.precioTotal());
	            
	            System.out.print("DESEA ADQUIRIR ESTE PRODUCTO: "+ p1.getNombreProducto()); respuesta = in.next();
	            
	            if("si".equals(respuesta)){
	                System.out.println("ADQUIRIO ELL PRODUCTO "+ p1.getNombreProducto());
	            }
	            else{
	                System.out.println("NO HA DECIDIDO ADQUIRIR EL PRODUCTO "+ p1.getNombreProducto());
	            }
	            
	            System.out.print("DESEA INGRESAR OTRO PORDUCTO? "); opc = in.next().charAt(0);
	        }while(opc == 's' || opc == 'S');
	        
	        
	    }
	    
	}


