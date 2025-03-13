package es.cie.springbootback;

public class Ordenador {


    public Ordenador() {
    }
    private String modelo;
    private String marca;
    private double precio;
    private String serie;

    public Ordenador(String serie) {
        this.serie = serie;
    }




    public Ordenador(String modelo, String marca, double precio, String serie) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.serie = serie;
    }


    
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

}
