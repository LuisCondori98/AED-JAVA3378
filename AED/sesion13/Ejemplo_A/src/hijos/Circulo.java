package hijos;

import padre.Figura;

public class Circulo extends Figura {
	
	// Atributo privado
 	private double radio;
	//  Constructor
	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	// Métodos públicos sobre escritos (obligatorio)
	public double medida() {
		return radio;
	}
	public double area() {
		return Math.PI * radio * radio;
	}
	
}
