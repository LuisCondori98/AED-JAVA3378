package padre;

public abstract class Figura {
	
	// Atributos protegidos
	protected int x, y;
	// Constructor
 	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
   	}
	// Métodos públicos
  	public String ubicacion() {
      	return "(" + x + "," + y + ")";
   	}
	// Métodos públicos abstractos
	public abstract double medida();
	public abstract double area();
	
}
