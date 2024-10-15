package hijos;

import padre.Licencia;

public class Particular extends Licencia{

	private int dni;
	
	public Particular(String clase, String categoria, String fechaEmision, String fechaRenovacion, int dni) {
		
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.dni = dni;
	}
	
	public String datosLicenciaParticular() {
		
		return datosDelBrevete() + "\nDni \t\t\t: " + dni + "\nCodigo 2 \t\t: " + segundoCodigo();
	}
	
	private String segundoCodigo() {
		
		return categoria + dni;
	}
}
