package hijos;

import padre.Mamifero;

public class Gato extends Mamifero {

	// Método público
	public String mensaje() {
		return "soy gato";
	}
	// Método público (obligatorio)
	public String hacerRuido() {
		return "miau";
	}
	
}
