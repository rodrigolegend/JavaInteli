package Operadores04;
import java.util.Scanner;
public class OperadoresLogicosLogin2 {
    public static void main(String[] args) {

       String[] username = {"roy","admin","falco"};
       String[] password = {"12345","12","1"};


        Scanner input = new Scanner (System.in);

        System.out.println("ingrese el username");
        String user= input.next();

        System.out.println("ingresa el password");
        String pass= input.next();

        boolean isAuthent = false;

        for(int i= 0; i < username.length;i++) {

            if (username[i].equals(user) && password[i].equals(pass)) {
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


