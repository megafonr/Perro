/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.perro;

/**
 *
 * @author Rolo
 */
public class MiPerroConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClasePerro perrito, canraza;
        perrito = new ClasePerro();
        canraza = new ClasePerro("Labrador");
        perrito.ladrar();        
        perrito.mostrar();
        canraza.mostrar();
    }
}
