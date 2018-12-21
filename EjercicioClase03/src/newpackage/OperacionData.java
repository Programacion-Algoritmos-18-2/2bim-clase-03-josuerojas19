/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {
    ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList<Estadio> obtenerInformacion(){
        return informacion;
    }
    public double obtenerPromedioCapacidad(){
        double suma = 0;
            for (int i = 0; i <obtenerInformacion().size(); i++) {
                suma += obtenerInformacion().get(i).getCapacidad();
            }
            double prom = suma/obtenerInformacion().size();
            return prom;
    }
}
