package Control05;

public class etiquetasencontrol {
    public static void main(String[] args) {

        String frases = "tres tristes triges tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frases.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        // char letra = 'g';

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frases.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase");

    }
}


