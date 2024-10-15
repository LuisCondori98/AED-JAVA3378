package hijos;

import padre.Vehiculo;

public class Camioneta extends Vehiculo {

	private double precio;

	public Camioneta(String marca, String modelo, String placa, double precio) {
		
		super(marca, modelo, placa);
		this.precio = precio;
	}
	
	public String datosCompletos() {
		
		return super.datosCompletos() + "\nPrecio \t\t: " + precio + "\nDescuento \t: " + descuento() + "\nImporte total \t: " + aPagar();
	}
	
	private double descuento() {
		
		return 0.2 * precio;
	}
	
	private double aPagar() {
		
		return precio - descuento();
	}
}
