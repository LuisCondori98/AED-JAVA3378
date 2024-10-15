package hijos;

import padre.Vehiculo;

public class Auto extends Vehiculo {

	private double precio;

	public Auto(String marca, String modelo, String placa, double precio) {
		
		super(marca, modelo, placa);
		this.precio = precio;
	}
	
	public String datosDelAuto() {
		
		return datosDelVehiculo() + "\nPrecio \t\t: " + precio + "\nDescuento \t: " + descuento() + "\nImporte total \t: " + aPagar();
	}
	
	private double descuento() {
		
		return 0.1 * precio;
	}
	
	private double aPagar() {
		
		return precio - descuento();
	}
}
