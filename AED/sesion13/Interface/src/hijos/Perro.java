package hijos;

import padre.Mamifero;
import interfaces.*;

public class Perro extends Mamifero implements InterfazA, InterfazB {

	public String hacerRuido() {
		return "guau";
	}
	public String cuidado() {
		return "el perro puede tener rabia";
	}
	public String peligro() {
		return "el perro muerde";
	}
	
}

