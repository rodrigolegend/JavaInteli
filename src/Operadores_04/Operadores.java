package Operadores_04;

import javax.swing.*;

public class Operadores {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        int suma = i+j;

        System.out.println("suma = "+ suma);
         int numero =Integer.parseInt( JOptionPane.showInputDialog("Ingresa un numero"));
         if (numero % 2 ==0){
             System.out.println("numero par ="+ numero);
           }  else  {
                 System.out.println("numero impar ="+ numero);
             }
         }

}
