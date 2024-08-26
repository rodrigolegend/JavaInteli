package Control05;

import java.util.Scanner;

public class SentSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el mes del 1 al 12");
        int mes = input.nextInt();
        int numeroDias = 0;
        String esbiciestoOno = "unknow";
        System.out.println(" ingresa el año que quieras saber si es biciesto o no biciesto");

        int anio = input.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias =30;
                break;
            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;

        }
        if (mes == 2){
            if (numeroDias == 29){
                esbiciestoOno = "es biciesto";
            }
            else{
                esbiciestoOno = "no es biciesto";
            }
        }
        System.out.println("el mes que elegiste es: "+ mes + " y el año que elegiste es: " + anio );
        System.out.println(" tiene :"+ numeroDias +" y el año " + esbiciestoOno);

    }
}




