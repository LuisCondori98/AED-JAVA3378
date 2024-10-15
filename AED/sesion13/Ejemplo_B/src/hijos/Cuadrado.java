package hijos;

import padre.Figura;

public class Cuadrado extends Figura {
	
	// Atributo privado
	private double lado;
	//  Constructor
	public Cuadrado(int x, int y, double lado) {
		super(x, y);
		this.lado = lado;
	}
	// Métodos sobre escritos (obligatorio)
	public double area() {
		return lado * lado;
	}
    public String datosCompletos() {
		return  "ubicación :  " + ubicacion() + "\n" +
		        "lado      :  " + lado + "\n" +
			    "área      :  " + area() + "\n";
	}
    
}

