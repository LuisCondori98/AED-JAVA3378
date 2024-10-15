package hijo;

import interfaz.Vuelo;
import padre.Transporte;

public class Avion extends Transporte implements Vuelo {
	public Avion(int capacidad) {
		super(capacidad);
	}

	public String mostrarCapacidad() {
		return "Capacidad de pasajeros del Avi�n : " + capacidad;
	}

	public String avanzar() {
		return "el avi�n est� avanzando";
	}

	public String detener() {
		return "el avi�n se detuvo";
	}

	public String retroceder() {
		return "el avi�n est� retrocediendo";
	}

	public String subir() {
		return "el avi�n est� subiendo";
	}

	public String bajar() {
		return "el avi�n est� bajando";
	}
}
