package semana_05;

public class ArregloSueldos {

	private double sueldo[] = {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
	
	public ArregloSueldos() {
		
	}
	
	public int tamanio() {
		
		return sueldo.length;
	}
	
	public double obtener(int i) {
		
		return sueldo[i];
	}
	
	public double sueldoPromedio() {
		
		double sueldoProm = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			sueldoProm += obtener(i);
		}
		
		return sueldoProm;
	}
	
public double sueldoMayor() {
		
	double edadM = sueldo[0];
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(edadM < obtener(i)) {
				
				edadM = sueldo[i];
			}
		}
		
		return edadM;
	}
	
	public double edadMenor() {
		
		double edadM = sueldo[0];
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(edadM > sueldo[i]) {
				
				edadM = sueldo[i];
			}
		}
		
		return edadM;
	}
	
	public int cantMayoresSueldoPromedio() {
		
		int cant = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(sueldo[i] >= sueldoPromedio()){
				
				cant++;
			}
		}
		return cant;
	}
	
	public int cantMenoresSueldoPromedio() {
		
		int cant = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(sueldo[i] < sueldoPromedio()){
				
				cant++;
			}
		}
		return cant;
	}
}
