package sesion_06;

public class ArregloEdades {

	private int Edad[];
	private int indice;
	
	public ArregloEdades() {
		
		Edad = new int[10];
		indice = 0;
	}
	
	public int tamanio() {
		
		return indice;
	}
	
	public int obtener(int i) {
		
		return Edad[i];
	}
	
	public void adicionar(int ed) {
		
		if(indice == Edad.length ) {
			
			ampliarArreglo();
		}
		Edad[indice] = ed;
		indice++;
	}
	
	private void ampliarArreglo() {
		
		int[] aux = Edad;
		
		Edad = new int[indice + 10];
		
		for(int i = 0; i < tamanio(); i++) {
			
			Edad[i] = aux[i];
		}
	}
	
	public void eliminarAlFinal() {
		
		indice--;	
	}
	
	public void eliminarTodo() {
		
		indice = 0;
	}
	
	public int edadMayor() {
		
		int edadM = Edad[0];
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(Edad[i] >= edadM) {
				
				edadM = Edad[i];
			}
		}
		
		return edadM;
	}
	
	public int posPrimeraEdadAdulta() {
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(Edad[i] >= 20 && Edad[i] <= 59){
				
				return i;
			}
		}
		return -1;
	}
	
	public void incrementarPrimeraEdadAdulta() {
		
		Edad[posPrimeraEdadAdulta()] += 5;
	}
	
	public void remplazarPrimeraEdadAdulta() {
		
		Edad[posPrimeraEdadAdulta()] = edadMayor();
	}
}
