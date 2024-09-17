package sesion03;

public class Trabajador {

    private int Codigo, Categoria;
	private String Nombre;

    public Trabajador(int codigo, int categoria, String nombre) {
        this.Codigo = codigo;
        this.Categoria = categoria;
        this.Nombre = nombre;
    }
	
	public double retornarSueldoBruto() {
		if(Categoria == 0)
			return 5000;
		else if (Categoria == 1)
			return 4000;
		else if (Categoria == 2)
			return 3000;
		else
			return 2000;
	}
	
	public double calcularDescuento() {
		
		return retornarSueldoBruto() * 0.13;
	}
	
	public double calcularSueldoNeto() {
		
		return retornarSueldoBruto() - calcularDescuento();
	}

    public void getCodigo() {

        return this.Categoria;
    }

    public void setCodigo(int codigo) {

        return this.Codigo = codigo;
    }

    public void getCategoria() {

        return this.Categoria;
    }

    public void setCategoria(int categoria) {

        return this.Categoria = categoria;
    }

    public void getNombre() {

        return this.Nombre;
    }

    public void setNombre(String nombre) {

        return this.Nombre = nombre;
    }
}