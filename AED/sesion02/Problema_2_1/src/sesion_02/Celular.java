package sesion_02;

public class Celular {

	private int numero, segundos;
	private String usuario;
	private double precio;
	
	public Celular(int numero, int segundos, String usuario, double precio) {
		this.numero = numero;
		this.segundos = segundos;
		this.usuario = usuario;
		this.precio = precio;
	}
	
	public double calcularCostoConsumo(){
		
		return segundos * precio;
	}
	
	public double calcularImpuesto(){
		
		return calcularCostoConsumo() * 0.18;
	}
	
	public double calcularTotalAPagar(){
		
		return calcularCostoConsumo() + calcularImpuesto();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
