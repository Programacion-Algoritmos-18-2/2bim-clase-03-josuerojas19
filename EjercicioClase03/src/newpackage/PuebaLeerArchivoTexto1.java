/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import lecturaArchivosClase.*;

/**
 *
 * @author David Pardo
 */
public class PuebaLeerArchivoTexto1 {
    public static void main(String[] args) {
        OperacionData operacion  = new OperacionData();
        LeerArchivoTexto1 archivo = new LeerArchivoTexto1();
        archivo.abrirArchivo();
        operacion.agregarInformacion(archivo.leerRegistros());
        archivo.leerRegistros();
        archivo.cerrarArchivo();
        System.out.println("El promedio de capaciadad es: "+operacion.obtenerPromedioCapacidad());
    }
   
}
