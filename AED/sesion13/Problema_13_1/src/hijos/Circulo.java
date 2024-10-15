package hijos;

import padre.Figura;
import interfaces.Dibujable;

public class Circulo extends Figura implements Dibujable {
	
	// Atributo público
 	public double radio;
	//  Constructor
	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	//  Métodos sobre escritos (obligatorio)
	public double area() {
		return Math.PI * radio * radio;
	}
	public String dibujar() {
		return "el círculo puede ser dibujado";
	}
	
}
