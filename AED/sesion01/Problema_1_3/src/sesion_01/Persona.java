package sesion_01;

public class Persona {

	private String nombre, apellido;
	private int edad;
	private double estatura, peso;
	
	public Persona(String nombre, String apellido, int edad, double estatura, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String retornarEstadoPersona(){
		
		if(edad >= 18)
			return "mayor de edad";
		else
			return "menor de edad";
	}
	
	public double indiceMasaCorporal() {

		return peso / Math.pow(estatura, 2);
	}
}
