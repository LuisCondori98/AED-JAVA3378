package Arreglos;

public class ArregloEdades {

	private int edad[] = {27, 22, 13, 12, 25, 11, 29, 70, 15, 21};
	
	public ArregloEdades() {
		
		
	}
	
	public int tamanio() {
		
		return edad.length;
	}
	
	public int obtener(int i) {
		
		return edad[i];
	}
	
	public double sumatoriaEdades() {
		
		double suma = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			suma += edad[i];
		}
		
		return suma;
	}
	
	public double retornarEdadPromedio() {
		
		double promedio = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			promedio += obtener(i);
		}
		
		return promedio / tamanio();
	}
	
	public int edadMayor() {
		
		int edadM = edad[0];
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(edadM < obtener(i)) {
				
				edadM = edad[i];
			}
		}
		
		return edadM;
	}
	
	public int edadMenor() {
		
		int edadM = edad[0];
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(edadM > edad[i]) {
				
				edadM = edad[i];
			}
		}
		
		return edadM;
	}
	
	public int cantMayoresEdad() {
		
		int cEdad=0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i) >= 18) {
				
				cEdad++;
			}
		}
		
		return cEdad;
	}
	
	public int cantMenoresEdad() {
		
		int cEdad=0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i) < 18) {
				
				cEdad++;
			}
		}
		
		return cEdad;
	}
	
	public int posPrimeraEdad() {
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(edad[i] >= 12 && edad[i] <= 20) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public int posUltimaEdad() {
		
		for(int i = tamanio() - 1; i >= 0; i--) {
			
			if(edad[i] >= 12 && edad[i] <= 20) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public void generarEdades() {
		
		for(int i = 0; i < tamanio(); i++) {
			
			edad[i] = aleatorio(10, 99);
		}
	}
	
	public int aleatorio(int min, int max) {
		
		return (int)((max - min + 1)* Math.random()) + min;
	}
}
