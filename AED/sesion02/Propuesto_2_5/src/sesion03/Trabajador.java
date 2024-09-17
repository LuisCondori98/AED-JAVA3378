package sesion03;

public class Trabajador {

    public int Codigo, Categoria;
	public String Nombre;
	
	public double retornarSueldoBruto() {
		if(Categoria == 0)
			return 5000;
		else if (Categoria == 1)
			return 4000;
		else if (Categoria == 2)
			return 3000;
		else
			return 2000;
	}
	
	public double calcularDescuento() {
		
		return retornarSueldoBruto() * 0.13;
	}
	
	public double calcularSueldoNeto() {
		
		return retornarSueldoBruto() - calcularDescuento();
	}
}