package arreglo;

import java.util.ArrayList;

import clase.Docente;

public class ArregloDocentes {

	private ArrayList<Docente> doc;
	
	public ArregloDocentes() {
		
		doc = new ArrayList<Docente>();
		
		doc.add(new Docente("Luis", 8963578, 12, 60));
		doc.add(new Docente("Javier", 6973025, 10, 40));
		doc.add(new Docente("Fiorella", 1967843, 8, 70));
		doc.add(new Docente("Juanjo", 2976358, 4, 20));
		doc.add(new Docente("Raul", 4325769, 7, 58));
		doc.add(new Docente("Maria", 5796138, 11, 72));
		doc.add(new Docente("Lindsay", 7356941, 6, 42));
		doc.add(new Docente("Alonso", 8036495, 17, 72));
	}
	
	public void adicionar(Docente d) {
		
		doc.add(d);
	}
	
	public int tamanio() {
		
		return doc.size();
	}
	
	public Docente obtener(int i) {
		
		return doc.get(i);
	}
	
	public double sueldoPromedio() {
		
		double prom = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			prom += obtener(i).calcularSueldoBruto();
		}
		
		return prom / tamanio();
	}
	
	public double sueldoMayor() {
		
		double sueldoM = obtener(0).calcularSueldoBruto();
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(obtener(i).calcularSueldoBruto() > sueldoM) {
				
				sueldoM = obtener(i).calcularSueldoBruto();
			}
		}
		
		return sueldoM;
	}
	
	public double sueldoMenor() {
		
		double sueldoM = obtener(0).calcularSueldoBruto();
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(obtener(i).calcularSueldoBruto() < sueldoM) {
				
				sueldoM = obtener(i).calcularSueldoBruto();
			}
		}
		
		return sueldoM;
	}
	
	public double tarifaMayor() {
		
		double tarifaM = obtener(0).getTarifa();
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(obtener(i).getTarifa() > tarifaM) {
				
				tarifaM = obtener(i).getTarifa();
			}
		}
		
		return tarifaM;
	}
	
	public double tarifaMenor() {
		
		double tarifaM = obtener(0).getTarifa();
		
		for(int i = 1; i < tamanio(); i++) {
			
			if(obtener(i).getTarifa() < tarifaM) {
				
				tarifaM = obtener(i).getTarifa();
			}
		}
		
		return tarifaM;
	}
}
