package padre;

public abstract class Figura {
	
	protected int x, y;
	
	// Constructor
 	public Figura(int x, int y) {
 		
		this.x = x;
		this.y = y;
   	}
	
 	// Método público
  	public String ubicacion() {
  		
      	return "(" + x + "," + y + ")";
   	}
	// Método abstracto
	public abstract double area();
	
}
