package Operadores04;
import java.util.Scanner;
public class OperadoresLogicosLogin {
    public static void main(String[] args) {

    String[] usrnames = new String[3];
    String [] password = new String[3];

     usrnames[0]= "Roy";
     usrnames[1]= "admin";
     usrnames[2]="falco";


     password[0]="12345";
     password[1]="123";
     password[2]="password";

    Scanner input = new Scanner (System.in);

        System.out.println("ingrese el username");
        String user= input.next();

        System.out.println("ingresa el password");
        String pass= input.next();

        boolean isAuthent = false;

        for(int i= 0; i < usrnames.length;i++) {

            if (usrnames[i].equals(user) && password[i].equals(pass)) {
                isAuthent = true;
                break;
            }
        }
            if(isAuthent ==true){
                System.out.println("bienvenido ".concat(user).concat("!"));
            }
            else{
                System.out.println("el pass o el user es incorrecto");
            }
        }



        }


