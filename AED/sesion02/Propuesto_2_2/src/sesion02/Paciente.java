package sesion02;

public class Paciente {

  private String Nombre;
  private int Edad;
  private double Talla, Peso;

  public Paciente(String nombre, int edad, double talla, double peso) {
    this.Nombre = nombre;
    this.Edad = edad;
    this.Talla = talla;
    this.Peso = peso;
  }

  public String getNombre() {
    return this.Nombre;
  }

  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public int getEdad() {
    return this.Edad;
  }

  public void setEdad(int edad) {
    this.Edad = edad;
  }

  public double getTalla() {
    return this.Talla;
  }

  public void setTalla(double talla) {
    this.Talla = talla;
  }

  public double getPeso() {
    return this.Peso;
  }
  
  public void setPeso(double peso) {
    this.Peso = peso;
  }
}
