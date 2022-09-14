
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gonza
 */
class Trayecto {

    private int vendidos;
    private double precio;
    private String pais;
    private String ciudad;
    private Date fecha;

    public Trayecto(String pais, String ciudad) {
        this.vendidos = 0;
        this.precio = 0.0;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public int getVendidos() {
        return vendidos;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void incrementarVendidos(){
        this.vendidos++;
    }
}
