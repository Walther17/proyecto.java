package Empresa;

public class Empleado {
	
	    protected double salario;
	    protected String nombres_apellidos;
	    protected double cedula;

	    public Empleado(String nombres_apellidos, double cedula) {
	    	this.nombres_apellidos = nombres_apellidos;
	        this.cedula = cedula;
	    }
	    
	    public Empleado(double salario){
	        this.salario = salario;
	    }

	    
	    public void setNombresYapellidos(String nombres_apellidos) {
	        this.nombres_apellidos = nombres_apellidos;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public void setCedula(double cedula) {
	        this.cedula = cedula;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public String getNombres_apellidos() {
	        return nombres_apellidos;
	    }

	    public double getCedula() {
	        return cedula;
	    }
	    	
	    }


