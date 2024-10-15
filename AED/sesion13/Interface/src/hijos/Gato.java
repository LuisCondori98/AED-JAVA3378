package hijos;

import padre.Mamifero;
import interfaces.InterfazA;

public class Gato extends Mamifero implements InterfazA {

	public String mensaje() {
		return "soy gato";
	}
	public String hacerRuido() {
		return "miau";
	}
	public String cuidado() {
		return "el gato puede tener rabia";
	}
	
}
