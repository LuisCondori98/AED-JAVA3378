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
	// Métodos publicos sobre escritos (obligatorio)
	public double medida() {
		return lado;
	}
	public double area() {
		return lado * lado;
	}
	
}
