/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Anthony
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2. ponta = 1.0f;
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
        
        
        
        
    }
}
