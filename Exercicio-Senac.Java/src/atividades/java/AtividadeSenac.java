/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades.java;

import javax.swing.JOptionPane;

/**
 *
 * @author sala302b
 */
public class AtividadeSenac {
 
    final static double valor1 = 10;
    final static double valor2 = 30;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int cateto1 = 10;
        int cateto2 = 20;
        
        double hipotenuza = teoremaPitagora(cateto1, cateto2 );
        
        System.out.println("Resultado: " + hipotenuza);
        
        double resultadoSoma = somaNumeros();
        
        System.out.println("Resultado da soma: " + resultadoSoma);
    }
    //(int QUALQUERNOME1, int QUALQUERNOME2)
    private static double teoremaPitagora(int pipoca1, int pipoca2) {
        // Math.sqrt = Ao Quadrado
        return Math.sqrt ((valor1 * valor1) + (valor2 * valor2));
        
        
        
    }
        private static double somaNumeros(){
            return valor1 + valor2;
        }    
}



