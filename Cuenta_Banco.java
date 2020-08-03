package Cuenta;

import java.util.Scanner;

public class Cuenta_Banco {
	
	public static void main(String[] args) {
		Cuenta cuentaBanco = new Cuenta();
		Cuenta cuentaAhorros = new Cuenta();
		Cuenta cuentaCorriente = new Cuenta();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el tipo de cuenta:");
		String tipoDeCuenta = sc.nextLine().toUpperCase();
		
		
		
		if (tipoDeCuenta.equals("Cuenta_Corriente")) {
			
			System.out.println("Ingrese sus nombres completos :");
			cuentaCorriente.setNombre(sc.nextLine().toUpperCase());
			System.out.println("Ingrese su dinero:");
			
			cuentaCorriente.setDinero(Double.parseDouble(sc.nextLine()));

			if (cuentaCorriente.dinero() <= 1000) {
				cuentaCorriente.setDinero(cuentaCorriente.getDinero() * 1.01);
				System.out.println("Señor " + cuentaCorriente.getNombre()
				+
				" usted ha recibido un aumento del 1 %, su saldo actual en su Cuenta corriente es de $"
				+ cuentaCorriente.getDinero());
				
			}else {
				System.out.println("Señor " + cuentaCorriente.getNombre() +
						" tiene la cantidad actual de: " + cuentaCorriente.getDinero());

			}
		}
		
		else if  (tipoDeCuenta.equals("Cuenta_de_Ahorros")) {
			System.out.println("Ingrese sus nombres completos :");
			cuentaAhorros.setNombre(sc.nextLine().toUpperCase());
			System.out.println("Ingrese su dinero :");
			cuentaAhorros.setDinero(Double.parseDouble(sc.nextLine()));

			System.out.println("Señor  " + cuentaAhorros.getNombre() +
					" su saldo actual en su cuenta de Ahorros es de  "	+ cuentaAhorros.getDinero());
		}
		
		else System.out.println("Usted debe ingresar una Cuenta Corriente o una Cuenta de Ahorros");


				
	}

}
