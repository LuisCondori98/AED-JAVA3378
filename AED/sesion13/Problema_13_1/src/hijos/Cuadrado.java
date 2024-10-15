package hijos;

import padre.Figura;
import interfaces.*;

public class Cuadrado extends Figura implements Dibujable, Rotable {
	
	//  Atributo público
	public double lado;
	//  Constructor
	public Cuadrado(int x, int y, double lado) {
		super(x, y);
		this.lado = lado;
	}
	// Métodos sobre escritos (obligatorio)
	public double area() {
		return lado * lado;
	}
	public String dibujar() {
		return "el cuadrado puede ser dibujado";
	}
	public String rotar() {
		return "el cuadrado puede rotar";
	}
	
}
