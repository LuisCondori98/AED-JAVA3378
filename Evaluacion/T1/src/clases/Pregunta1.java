package clases;

public class Pregunta1 {

	private int Codigo, Categoria, Horas;
	private String Nombre;
	private double Tarifa;
	
	public Pregunta1(int codigo, int categoria, int horas, String nombre, double tarifa) {
		this.Codigo = codigo;
		this.Categoria = categoria;
		this.Horas = horas;
		this.Nombre = nombre;
		this.Tarifa = tarifa;
	}
	
	//-	Un m�todo que retorne el sueldo bruto (horas * tarifa).
	public double retornarSueldoBruto() {
		
		if(Categoria == 1)
			this.Tarifa = 18.5;
		if(Categoria == 2)
			this.Tarifa = 24.5;
		if(Categoria == 3)
			this.Tarifa = 38.5;
		
		return Horas * this.Tarifa;
	}
	
	//-	Un m�todo que retorne el descuento por AFP (13% del sueldo bruto).
	public double retornarDescuentoAFP() {
		
		return retornarSueldoBruto() * 0.13;
	}
	
	//-	Un m�todo que retorne el descuento por EPS (8% del sueldo bruto).
	public double retornarDescuentoEPS() {
		
		return retornarSueldoBruto() * 0.08;
	}
	
	//-	Un m�todo que retorne el sueldo neto (sueldo bruto � descuento AFP � descuento EPS)
	public double retornarSueldoNeto() {
		
		return retornarSueldoBruto() - retornarDescuentoAFP() - retornarDescuentoEPS();
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}

	public int getCategoria() {
		return Categoria;
	}

	public void setCategoria(int categoria) {
		this.Categoria = categoria;
	}

	public int getHoras() {
		return Horas;
	}

	public void setHoras(int horas) {
		this.Horas = horas;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public double getTarifa() {
		return this.Tarifa;
	}

	public void setTarifa(double tarifa) {
		this.Tarifa = tarifa;
	}
}
