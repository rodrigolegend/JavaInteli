import java.util.Scanner;

public class clase23Tienda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el nombre del libro");
        String nombre = input.nextLine();
        System.out.println("ingresa el codigo del libro");
        int codigo  = Integer.parseInt(input.nextLine());
        System.out.println("ingresa el precio");
        Double precio =  Double.parseDouble(input.nextLine());

        System.out.println("el libro que ingresaste es :"+ nombre+ " y el codigo es:"+ codigo+ " y el precio que ingresaste es:"+ precio);


    }
}
