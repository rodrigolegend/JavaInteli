package Control05;
import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        //para cada elemento de arreglo
        
        int []  numeros= {1,3,5,7,9,11,15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }
        String [] arregloConLLave = {"Rodrigo","Ricardo","lala","nena","chaco"};
        for(String nombres : arregloConLLave){
            System.out.println("nombres = " + nombres);
        }


    }
}
