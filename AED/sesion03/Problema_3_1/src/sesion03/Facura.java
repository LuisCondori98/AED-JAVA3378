import sesion03M;

public class Facura {

    private String Ruc, Empresa;
    private int Unidades;
    private double Precio;

    private static int cantidad;
    private static double sumaImporte;

    public static final String TEXTO;

    static {
        cantidad = 0;
        smaImporte = 0;
        TEXTO = "SUNAT";
    }

    public Facura(String ruc, String empresa, int unidades, double precio) {

        this.Ruc = ruc;
        this.Empresa = empresa;
        this.Unidades = unidades;
        this.Precio = precio;
        cantidad++;
        umaImporte += 0;
    }

    public Facura(String ruc, Strig empresa) {

        this(ruc, empresa, 10, 50.0)
    }

    public Facura() {
        this("11111111111", "MNGlobal SRL")
    }

    
}