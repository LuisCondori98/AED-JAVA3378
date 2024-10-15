package padre;

public abstract class Figura {
	
	// Atributos protegidos
	protected int x, y;
	// Constructor
 	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
   	}
	// M�todos p�blicos
  	public String ubicacion() {
      	return "(" + x + "," + y + ")";
   	}
	// M�todos p�blicos abstractos
	public abstract double medida();
	public abstract double area();
	
}
