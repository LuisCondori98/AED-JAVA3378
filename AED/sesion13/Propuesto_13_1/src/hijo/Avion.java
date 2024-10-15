package hijo;

import interfaz.Vuelo;
import padre.Transporte;

public class Avion extends Transporte implements Vuelo {
	public Avion(int capacidad) {
		super(capacidad);
	}

	public String mostrarCapacidad() {
		return "Capacidad de pasajeros del Avión : " + capacidad;
	}

	public String avanzar() {
		return "el avión está avanzando";
	}

	public String detener() {
		return "el avión se detuvo";
	}

	public String retroceder() {
		return "el avión está retrocediendo";
	}

	public String subir() {
		return "el avión está subiendo";
	}

	public String bajar() {
		return "el avión está bajando";
	}
}
