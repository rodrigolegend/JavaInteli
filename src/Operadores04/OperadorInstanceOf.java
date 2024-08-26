package Operadores04;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Objeto de clase string";

        Integer num = 5;

        Boolean es = texto instanceof String; // para instanceof es la variable instanceof y el tipo de la variable
        //es decir si vas a comparar string tiene que ser de tipos string   int con int double con double etc
        System.out.println("es de tipo string la variable texto? " + es);

        es = texto instanceof Object;
        System.out.println("es de tipo string la variable texto? " + es);



        es = num instanceof Integer;
        System.out.println("num es de tipo integer?  " + es);

        es = num instanceof Number;
        System.out.println("num es de tipo integer?  " + es);

        es = num instanceof Object;
        System.out.println("num es de tipo object?  " + es);

        Double dec = 532.3;
        es = dec instanceof Number;
        System.out.println("dec es del tipo number?  " + dec);

        es = es instanceof Boolean; // la variable boolean debe ir en mayuscula Boolean por que si no para instance of marcara error
        System.out.println("bol  es de tipo un boolean? " + es);
    }
}
