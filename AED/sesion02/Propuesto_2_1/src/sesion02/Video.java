package sesion02;

public class Video {
  
  private int Codigo;
  private String NombreVideo;
  private double Duracion, Precio, TipoCambio;

  public Video(int codigo, String nombreVideo, double duracion, double precio, double tipoCambio) {
    this.Codigo = codigo;
    this.NombreVideo = nombreVideo;
    this.Duracion = duracion;
    this.Precio = precio;
    this.TipoCambio = tipoCambio;
  }

  public double retornarPrecioDolares() {

    return this.Precio / this.TipoCambio;
  }

  public int getCodigo() {
    return Codigo;
  }

  public void setCodigo(int codigo) {
    Codigo = codigo;
  }

  public String getNombreVideo() {
    return NombreVideo;
  }

  public void setNombreVideo(String nombreVideo) {
    NombreVideo = nombreVideo;
  }

  public double getDuracion() {
    return Duracion;
  }

  public void setDuracion(double duracion) {
    Duracion = duracion;
  }

  public double getPrecio() {
    return Precio;
  }

  public void setPrecio(double precio) {
    Precio = precio;
  }

  public double getTipoCambio() {
    return TipoCambio;
  }

  public void setTipoCambio(double tipoCambio) {
    TipoCambio = tipoCambio;
  }
}
