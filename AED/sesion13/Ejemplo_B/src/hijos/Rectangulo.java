package hijos;

import padre.Figura;

public class Rectangulo extends Figura {
	
	// Atributos privados
	private double ancho, alto;
	// Constructor
    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }
	// Métodos públicos sobre escritos (obligatorio)
    public double area() {
        return ancho * alto;
    }
    public String datosCompletos() {
		return "ubicación :  " + ubicacion() + "\n" +
		       "ancho     :  " + ancho + "\n" +
			   "alto      :  " + alto + "\n" +
			   "área      :  " + area() + "\n";
	}
}
