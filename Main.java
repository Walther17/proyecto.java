package Corredor;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Corredor e1 = new Corredor();
	        int correr,recarga;
	        String opc = null;
	        
	        
	       System.out.print("CUAL ES LA ENERGIA DEL CORREDOR : ");
	       e1.setEnergia(in.nextInt());
	       do{
	           System.out.println("CUANTAS VECES CORRERA EL COMPETIDOR : ");
	           correr = in.nextInt();
	       
	            System.out.println("EL CORREDOR COMENZARA A CORRER");
	            
	            for(int i=0;i<correr;i++){
	                    e1.correr();
	                    e1.verificarEnergia();
	            }
	            
	            System.out.print(" LA ENERGIA DEL CORREDOR ES: "+ e1.getEnergia()); 
	            
	            
	            if(e1.getEnergia() == 0){
	                System.out.println();
	                e1.energiaCero();
	                System.out.println("RECARGANDO ENERGIA");
	                System.out.println("CUANTAS VECES VA ENTRENAR EL CORREDOR : "); recarga = in.nextInt();
	                for(int i=0;i<recarga;i++){
	                    e1.recargarEnergia(10);
	                    e1.entrenar();
	                }
	                System.out.print("LA ENERGIA DEL CORREDOR ES: "+e1.getEnergia());
	            }
	          
	            else{
	            	System.out.println("          ");
	                System.out.println("RECARGANDO ENERGIA");
	                System.out.println("CUANTAS VECES EL CORREDOR ENTRENA?: "); recarga = in.nextInt();
	                for(int i=0;i<recarga;i++){
	                    e1.recargarEnergia(10);
	                    e1.entrenar();
	                }
	                System.out.print("LA ENERGIA DEL CORREDOR ES: "+e1.getEnergia());
	            }
	            
	            System.out.println("DESEA QUE EL COMPETIDOR VUELVA A CORREER? (SI/NO)");
	            opc = in.next();
	            System.out.println("  ");
	        }while("s".equals(opc) || "S".equals(opc) || "si".equals(opc) || "SI".equals(opc) || "Si".equals(opc));    
	        
	       
	        
	    }
	    
	}


