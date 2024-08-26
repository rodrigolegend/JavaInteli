package Control05;

public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 7.0f;
        if (promedio >= 6.5) {
            System.out.println("Excelente promedio");
        }
        else if(promedio >=6.0){
            System.out.println(" realmente buen promedio");
        }
        else{
            System.out.println("necesitas mejorar el promedio un poco");
        }
        System.out.println("tu promedio es :" + promedio);
    }
}
