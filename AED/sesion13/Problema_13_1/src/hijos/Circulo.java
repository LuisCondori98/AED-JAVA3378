package hijos;

import padre.Figura;
import interfaces.Dibujable;

public class Circulo extends Figura implements Dibujable {
	
	// Atributo p�blico
 	public double radio;
	//  Constructor
	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	//  M�todos sobre escritos (obligatorio)
	public double area() {
		return Math.PI * radio * radio;
	}
	public String dibujar() {
		return "el c�rculo puede ser dibujado";
	}
	
}
