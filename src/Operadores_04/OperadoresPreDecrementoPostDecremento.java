package Operadores_04;

public class OperadoresPreDecrementoPostDecremento {
    public static void main(String[] args) {
        
        //pre incremento
        int i = 1;
        int j = ++i; //pre incremento i = i +1  = 2
        System.out.println("j = " + j);
        
        //post incremento
        i = 2;
        j = i++; // post incremento  pasa 1 iteracion se asigna a la variable en este caso a i   y despues se incrementa a ella misma
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //pre decremento
        i = 3;
        j = --i; // i valia 3 pero con el pre decremento se decrementa a 2 se asigna a i  y toma el valor predecrementado j
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //post decremento
        i = 4;
        j = i-- ; // i vale 4 pero  primero se decrementa i de 4 a 3 y j obtiene el valor de 4 osea antes del decremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
