package Empresa;

public class Oficinista extends Empleado {
	private int numeroDeIdentificacion;
    private int codigoArea;

    public Oficinista(int numeroDeIdentificacion, int codigoArea, String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.codigoArea = codigoArea;
    }

    public Oficinista(double salario) {
        super(salario);
        
    }
    

    public double salarioOficinista(){
        return salario;
    }
}

}
