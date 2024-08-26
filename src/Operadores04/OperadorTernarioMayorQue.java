package Operadores04;

import java.util.Scanner;

public class OperadorTernarioMayorQue {
    public static void main(String[] args) {


        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num1 = input.nextInt();

        System.out.println("ingresa un 2ndo numero");
        int num2 = input.nextInt();

        System.out.println("ingresa un 3er numero");
        int num3 = input.nextInt();

        max = (num1 > num2) ? num1 : num2; // si numero 1 es mayor que num2  retornamos num1 y si es falso regresa num2 y se lo asignamos a max
        max = (max > num3) ? max : num3; // si max es mayor que num 3 regresamos max a la variable max y si no le ingresamos el valor de num3 a max
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("el numero mayor fue: = " + max);




    }
}
