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
public class Atividade3 {
    
     public static void main(String[] args) {
         
    String variavell = "O rato roeu a roupa";
    String variavel2 = " Do rei de roma";
        
    
         String resultado = concatenar (variavell, variavel2);
         System.out.println(resultado);

     } 
      private static String concatenar(String v1, String v2) {
        
   
     String concatenadas = v1 + v2;
     concatenadas = concatenadas.replace("a", "1")
     .replace ("e", "5")
     .replace ("i", "9")
     .replace ("o", "15")
     .replace ("u", "21");     
             
              return (concatenadas) ;
    }
}
