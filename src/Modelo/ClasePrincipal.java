/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Formulario1;
import Vista.VentanaLogin;

/**
 *
 * @author David
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaLogin ventanaIngreso = new VentanaLogin ();
        ventanaIngreso.show();
        Formulario1 prueba = new Formulario1 ();
        prueba.show();
        
    }
    
}
