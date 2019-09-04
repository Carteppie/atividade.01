/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1.java;

/**
 *
 * @author sala302b
 */
public class Atividade2 {
       
    public static void main(String[] args) {
        
        double lado1 = 5;
        double lado2 = 15;
        double mariola = misturaGoiaba(lado1, lado2);
        
        System.out.println(mariola);
                 
    }
    private static double misturaGoiaba(double l1, double l2) {
        
        return (l1 * l2) + l1 + l1 +l2 + l2;
     
    }
}
