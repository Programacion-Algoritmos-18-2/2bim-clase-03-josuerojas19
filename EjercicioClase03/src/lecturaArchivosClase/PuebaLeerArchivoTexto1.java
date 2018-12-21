/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivosClase;

/**
 *
 * @author David Pardo
 */
public class PuebaLeerArchivoTexto1 {
    public static void main(String[] args) {
        LeerArchivoTexto1 archivo = new LeerArchivoTexto1();
        archivo.abrirArchivo();
        archivo.leerRegistros();
        archivo.cerrarArchivo();
    }
   
}
