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
	// M�todos sobre escritos (obligatorio)
	public double area() {
		return lado * lado;
	}
    public String datosCompletos() {
		return  "ubicaci�n :  " + ubicacion() + "\n" +
		        "lado      :  " + lado + "\n" +
			    "�rea      :  " + area() + "\n";
	}
    
}

