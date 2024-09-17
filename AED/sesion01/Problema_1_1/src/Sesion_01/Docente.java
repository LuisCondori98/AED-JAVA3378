package Sesion_01;

public class Docente {
	
	public int codigo , horas;
	public String nombre; 
	public double tarifa;
	
	public double retornarSueldoBruto(  ){
		
		return horas * tarifa;
	}
	
	public double calcularDescuento(){
		
		if(retornarSueldoBruto() < 4500)
			return retornarSueldoBruto() * 0.12;
		else if(retornarSueldoBruto() >= 4500 && retornarSueldoBruto() < 6500)
			return retornarSueldoBruto() * 0.14;
		else 
			return retornarSueldoBruto() * 0.16;
	}
	
	public double calcularSueldoNeto(){
		
		return retornarSueldoBruto() - calcularDescuento();
	}
}
