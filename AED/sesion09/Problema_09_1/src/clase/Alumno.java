package clase;

public class Alumno {
	
	private int codigo, nota1, nota2;
	private String nombre;	
	
    public Alumno(int codigo, String nombre, int nota1, int nota2) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNota1() {
		return nota1;
	}
	
	public int getNota2() {
		return nota2;
	}	    		

	public double promedio() {
		return (nota1 + nota2) / 2.0;
	}
	
}