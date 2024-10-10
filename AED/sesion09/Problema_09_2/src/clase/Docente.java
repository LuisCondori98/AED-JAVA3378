package clase;

public class Docente {

	private String Nombre;
	private int Codigo, Horas;
	private double Tarifa;
	
	public Docente(String nombre, int codigo, int horas, double tarifa) {
		
		Nombre = nombre;
		Codigo = codigo;
		Horas = horas;
		Tarifa = tarifa;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getHoras() {
		return Horas;
	}

	public void setHoras(int horas) {
		Horas = horas;
	}

	public double getTarifa() {
		return Tarifa;
	}

	public void setTarifa(double tarifa) {
		Tarifa = tarifa;
	}
	
	public double calcularSueldoBruto() {
		
		return Horas * Tarifa;
	}
}
