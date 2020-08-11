package Tienda;

public class Cd {
	
	private String Titulo;
	private String Interprete;
	private int Aniopublicacion;
	private double Valorcd;
	
	
	
	public Cd(String titulo, double valorCd) {
		super();
		Titulo = titulo;
		Valorcd = valorCd;
		
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getInterprete() {
		return Interprete;
	}
	public void setInterprete(String interprete) {
		Interprete = interprete;
	}
	public int getAniopublicacion() {
		return Aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		Aniopublicacion = aniopublicacion;
	}
	public double getValorcd() {
		return Valorcd;
	}
	public void setValorCd(double valorcd) {
		Valorcd = valorcd;
	} 

	public double getValorcd1() {
		double desc = 0;
		double subtotal = 0;
		double total_pagar = 0;
		subtotal = Valorcd * 0.09;
		desc = subtotal * 0.10;
		total_pagar = subtotal - desc;
		return Valorcd + total_pagar;
		
	}
}
