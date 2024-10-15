package hijos;

import padre.Figura;

public class Circulo extends Figura {
	
	// Atributo privado
 	private double radio;
	// Constructor
	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	// Métodos sobre escritos (obligatorio)
	public double area() {
		return Math.PI * radio * radio;
	}
    public String datosCompletos() {
		return  "ubicación :  " + ubicacion() + "\n" +
		        "radio     :  " + radio + "\n" +
			    "área      :  " + area() + "\n";
	}
    
}
