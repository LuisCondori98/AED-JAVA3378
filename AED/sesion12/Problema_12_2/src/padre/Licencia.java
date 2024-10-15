package padre;

public class Licencia {

	protected String clase, categoria, fechaEmision, fechaRenovacion;

	public Licencia(String clase, String categoria, String fechaEmision, String fechaRenovacion) {
		
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosCompletos() {
		
		return "Clase \t\t\t: " + clase + "\nCategoria \t\t: " + categoria + "\nFecha emision \t\t: " + fechaEmision + "\nFecha Renovacion \t: " + fechaRenovacion;
	}
	
	public String datosDelBrevete() {
		
		return datosCompletos() + "\nCodigo \t\t\t: " + codigoGenerado();
	}
	
	public String codigoGenerado() {
		
		return clase + fechaEmision;
	}
}
