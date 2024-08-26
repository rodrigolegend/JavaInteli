package Control05;

import java.util.Scanner;

public class NumDiasMesCalcular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el mes del 1 al 12");
        int mes = input.nextInt();
        int numeroDias = 0;
        System.out.println(" ingresa el año que quieras saber si es biciesto o no biciesto");

        int anio = input.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }


        }
        String biciestoOno;
        if (numeroDias == 29) {
            biciestoOno = "es biciesto";
        } else {
            biciestoOno = "no es biciesto";
        }
        System.out.println("el mes tuvo :" + numeroDias );
        System.out.println(biciestoOno);


    }
    }

