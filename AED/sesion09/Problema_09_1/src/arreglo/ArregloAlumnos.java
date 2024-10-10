package arreglo;

import java.util.ArrayList;

import clase.Alumno;

public class ArregloAlumnos {
	
	private ArrayList <Alumno> alu;
	
    public ArregloAlumnos() {
    	
        alu = new ArrayList <Alumno> ();
        
    	adicionar(new Alumno(123, "Ana", 19, 15));
    	adicionar(new Alumno(456, "Juan", 15, 14));
    	adicionar(new Alumno(789, "Pedro", 17, 19));
    	adicionar(new Alumno(302, "David", 13, 18));
    	adicionar(new Alumno(417, "Carlos", 20, 19));
    	adicionar(new Alumno(641, "Jorge", 12, 13));
    	adicionar(new Alumno(208, "Maria", 15, 17));
    	adicionar(new Alumno(820, "Jose", 11, 10));
    }
    
	public void adicionar(Alumno x) {
		
		alu.add(x);
	}
	
	public int tamanio() {
		
		return alu.size();
	}
	
	public Alumno obtener(int i) {
		
		return alu.get(i);
	}
	
	public int cantAprobados() {
		
		int cant = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i).promedio() >= 13) {
				
				cant++;
			}
		}
		
    	return cant;
    }
	
	public int cantDesaprobados() {
		
		int cant = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i).promedio() < 13) {
				
				cant++;
			}
		}
		
    	return cant;
    }
	
	public String primerNombreDesaprobado() {
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i).promedio() < 13) {
				
				return obtener(i).getNombre();
			}
		}
		
		return null;
	}
	
	public String ultimoNombreAprobado() {
		
		for(int i = tamanio() - 1; i >= 0; i--) {
			
			if(obtener(i).promedio() >= 13) {
				
				return obtener(i).getNombre();
			}
		}
		
		return null;
	}
	
	public String segundoNombreDesaprobado() {
		
		int contDesaprobado = 0;
		
		for(int i = 0; i < tamanio(); i++) {
			
			if(obtener(i).promedio() < 13) {
				
				contDesaprobado++;
				
				if(contDesaprobado == 2) {
					
					return obtener(i).getNombre();
				}
			}
		}
		
		return null;
	}
	
	public String penultimoNombreAprobado() {
		
		int contAprobado = 0;
		
		for(int i = tamanio() - 1; i >= 0; i--) {
			
			if(obtener(i).promedio() >= 13) {
				
				contAprobado++;
				
				if(contAprobado == 2) {
					
					return obtener(i).getNombre();
				}
			}
		}
		
		return null;
	}
}

