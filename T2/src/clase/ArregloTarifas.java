package clase;

public class ArregloTarifas {

	private double tarifa[];
	private int indice;
	
	public ArregloTarifas() {
		
		tarifa = new double[10];
		indice = 0; 
	}
	
	public int tamanio() {
		
		return indice;
	}
	
	public double obtener(int p) {
		
		return tarifa[p];
	}
	
	public void adicionar(double s) {
		
		if (indice == tamanio())
			ampliarArreglo();
		
		tarifa[indice] = s;
		
		indice++;
	}
	
	private void ampliarArreglo() {
		
		double aux[] = tarifa;
		
		tarifa = new double[indice + 10];
		
		for (int i = 0; i < indice; i++)
			
			tarifa [i] = aux[i];
	}
	
	public void eliminarTodo() {
		
		indice = 0;
	}
	
	public void eliminarFinal() {
		
		indice--;
	}
	
	public int posicionUltimaTarifaMenorQue100() {
		
		for(int i = tamanio() - 1; i >= 0; i--) {
			
			if(obtener(i) < 100) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public double sumaTarifasMayores100() {
		
		double aTarifas = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i) > 100) {
				
				aTarifas += obtener(i);
			}
		}
		
		return aTarifas;
	}
	
	public void reemplazarUltimaTarifaMenorQue100() {
		
		int pos = posicionUltimaTarifaMenorQue100();
		
        if (pos != -1) {
        	
            tarifa[pos] = sumaTarifasMayores100();
        }
	}
	
	public int incrementarTarifasMenoresQue100() {
		
        int cTarifas = 0;
        
        for (int i = 0; i < tamanio(); i++) {
        	
            if (obtener(i) < 100) {
            	
                tarifa[i] *= 1.15;
                
                cTarifas++;
            }
        }
        
        return cTarifas;
    }
	
	public void eliminarUltimaTarifaMenorQue100() {
		
		int pos = posicionUltimaTarifaMenorQue100();
		
        if (pos != -1) {
        	
            for (int i = pos; i < tamanio() - 1; i++) {
            	
                tarifa[i] = tarifa[i + 1];
            }
            
            eliminarFinal();
        }
	}
}
