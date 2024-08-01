package Operadores_04;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = 1+4;
        System.out.println("i = " + i);
        i = i+2;
        i += 2;
        System.out.println("i = " + i);
        
        i -= 4; // j = j-4
        System.out.println("j = " + j);
        
        j *= 3;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'R'";
        sqlString += " and c.cliente = 'Activos'";
        System.out.println("sqlString = " + sqlString);
    }
    
}
