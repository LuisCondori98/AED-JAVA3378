package hijos;

import padre.Mamifero;

public class Gato extends Mamifero {

	// M�todo p�blico
	public String mensaje() {
		return "soy gato";
	}
	// M�todo p�blico (obligatorio)
	public String hacerRuido() {
		return "miau";
	}
	
}
