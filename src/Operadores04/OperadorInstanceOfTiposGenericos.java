package Operadores04;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        // en este caso vemos que el instance of si ponemos las variables como tipo string o integer o cualquier otro tipo
        //no funcionara al compararlas con instance of ,para resolverlo nos vamos de un tipo al mas generico en este caso
        // el string nos vamos a un objeto y en los int a la clase number que es su ancestro de clase en este caso object
        // es el ancestro de los objetos en general
        Object texto = "Objeto de clase string";

        Number num = 5; // esto es autoboxing
        //pero se puede usar el metodo estatico de integer
        num = Integer.valueOf(7);


        Boolean es = texto instanceof String; // para instanceof es la variable instanceof y el tipo de la variable
        //es decir si vas a comparar string tiene que ser de tipos string   int con int double con double etc
        System.out.println("es de tipo string la variable texto? " + es);

        es = texto instanceof  Object;

        es = texto instanceof Integer;
        System.out.println("texto es de tipo integer?   " + es);

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
        System.out.println("dec es del tipo number?  " + es);

        es = es instanceof Boolean; // la variable boolean debe ir en mayuscula Boolean por que si no para instance of marcara error
        System.out.println("bol  es de tipo un boolean? " + es);

        es = num instanceof Long;
        System.out.println("numero es de tipo long?  " + es);

        es = num  instanceof Double;
        System.out.println("num es de tipo double = " + es);
    }
}
