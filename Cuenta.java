package Cuenta;

public class Cuenta {

			public String nombre;
			public double dinero;
			
			public String getNombre() {
				return nombre;
				
			}
			
			public void setNombre(String nombre) {
				this.nombre = nombre;
				
			}
			
			public double getDinero() {
				return dinero;
			}
			
			public void setDinero(double dinero) {
				this.dinero = dinero;
			}
			public double dinero() {
				return dinero;
			}
			
			public void depositar(double dinero) {
				if (dinero <= 1000) {
					dinero +=  dinero * 0.1;
					
			}else {
					this.dinero = dinero;
		}
	}
			public static void retirar() {
				
	}
}

		

