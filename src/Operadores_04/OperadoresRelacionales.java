package Operadores_04;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-9f;
        double l = 2.5435e4;
        boolean r  =false;
        
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b1;
        System.out.println("b2 seria signo invertido = " + b2);

        boolean b3 = i  != j; // si es diferente
        System.out.println("b3 = " + b3);
        
        boolean b4 = r == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = r != true;


        System.out.println("b5 = " + b5);
        
        boolean b6 = i > j;
        System.out.println("b6 = " + b6);
        
        boolean b8 = l <=k;
        System.out.println("b8 = " + b8);
    }
}
