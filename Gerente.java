package Empresa;

public class Gerente extends Empleado {
	 public Gerente(String nombres_apellidos, double cedula) {
	        super(nombres_apellidos, cedula);
	    }

	    public Gerente(double salario) {
	        super(salario);
	    }

	    public double salarioGerente(double viaticosPersonales, int anios){
	        double adicional;
	        if(anios  == 0){
	            return salario;
	        }
	        else{
	            adicional = salario * 0.05;
	            salario +=adicional+viaticosPersonales;
	            return salario;
	        }
	        
	    }
	}


