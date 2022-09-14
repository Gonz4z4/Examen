
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gonza
 */
public class Empresa {

    private String nombre;
    private int numeroSucursal;
    private String encargado;
    private ArrayList<Trayecto> trayectos;

    //constructor
    public Empresa(String nombre, int numeroSucursal, String encargado) {
        this.nombre = nombre;
        this.numeroSucursal = numeroSucursal;
        this.encargado = encargado;
        this.trayectos = new ArrayList<>();
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getEncargado() {
        return encargado;
    }

    public void addTrayecto(Trayecto trayecto) {
        this.trayectos.add(trayecto);
    }

    public ArrayList<Trayecto> buscarTrayecto(String pais) {
        ArrayList<Trayecto> trayectosEncontrados = new ArrayList<>();

        for (Trayecto trayecto : this.trayectos) {
            if (trayecto.getPais().equals(pais)) {
                trayectosEncontrados.add(trayecto);
            }
        }

        return trayectosEncontrados;
    }
}
