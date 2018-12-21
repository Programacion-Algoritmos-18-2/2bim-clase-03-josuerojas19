/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Josue
 */
public class Estadio {
    private String nombre, tipo_deporte;
    private double capacidad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo_deporte() {
        return tipo_deporte;
    }

    public void setTipo_deporte(String tipo_deporte) {
        this.tipo_deporte = tipo_deporte;
    }
    @Override
    public String toString(){
        return ("");
    }
}
