package Sesion_01;

public class Filmacion {

	public int codigo, minutos;
	public String titulo;
	public double precio;
	
	public double convertirPrecioDolares(){
		
		return precio / 3.65;
	}
}
