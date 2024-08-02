package Operadores_04;

public class OperadoresLogicos {
    public static void main(String[] args) {


        int i = 3;
        byte j = 7;
        boolean m = false;
        double l = 2.1425242e3;
        float k = 125e-5f;
        int  r = 3;
        double n = 567;
        float s = 6457474.234234f;
        boolean b1 = i == j && k >l;
        System.out.println("b1 = " + b1);

        b1 = i==r && n < s;
        System.out.println("b1 = " + b1);
        
        b1 = i == j || k < s;
        System.out.println("b1 = " + b1);

        boolean b4 = i ==j || k < n && m == true;
        System.out.println("b4 = " + b4);
        //primero seria and y luego el or en precedencia
        // de operadores
    }

}
