package padre;

public class Vehiculo {

	protected String marca, modelo, placa;

	public Vehiculo(String marca, String modelo, String placa) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public String datosDelVehiculo() {
		
		return "Marca \t\t: " + marca + "\nModelo \t\t: " + modelo + "\nPlaca \t\t: " + placa + "\nCodigo \t\t: " + codigoGenerado();
	}
	
	private String codigoGenerado() {
		
		return (marca + placa + modelo).toUpperCase();
	}
}
