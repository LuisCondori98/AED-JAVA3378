package padre;

public abstract class Figura {
	
	protected int x, y;
	
	// Constructor
 	public Figura(int x, int y) {
 		
		this.x = x;
		this.y = y;
   	}
	
 	// M�todo p�blico
  	public String ubicacion() {
  		
      	return "(" + x + "," + y + ")";
   	}
	// M�todo abstracto
	public abstract double area();
	
}
