package Control05;

public class For {
    public static void main(String[] args) {

        for(int i =0;i<=10;i++){
            if(!(i %2 ==0)){ //aqui negamos sacaria puros impares pero con el ! negamos y da el resultado contrario
                continue; // se salta los numeros impares con continue
            }
            System.out.println("i  es par = " + i);

        }



    }
}
