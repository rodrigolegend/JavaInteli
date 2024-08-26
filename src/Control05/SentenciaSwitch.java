package Control05;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes ;
        System.out.println("introduce un mes del 1 al 12");
         mes=input.nextInt();

        switch (mes){
            case 1:
                System.out.println("es enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
            case 4:
                System.out.println("abril");
            case 5:
                System.out.println("mayo");
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("numero no coinicide con los meses del calendario gregoriano");
        }




        byte   num = 11;
        switch (num){
            case 0:
                System.out.println("el num 0");
                break;
            case 1:
                System.out.println("el num 1");
                break;
            case 2:
                System.out.println("el num 2");
                break;
            case 3:
                System.out.println("el num 3");
                break;
            default:
                System.out.println("\rno hay un case que haga referencia a ese numero");


                String nombre =  "rodrigo";
                switch (nombre){
                    case "admin":
                        System.out.println("hola admin");
                        break;
                    case "user":
                        System.out.println("bienvenido user");
                        break;
                    case "rodrigo":
                        System.out.println("bienvenido rodrigo");
                        break;
                    default:
                        System.out.println("usuario no encontrado");
                }
        }
    }
}
