package Control05;

import javax.swing.*;

public class ForConArreglos {
    public static void main(String[] args) {
        String [] nombres = new String[6]; // de 6 elementos
        String [] arregloConLLave = {"Rodrigo","Ricardo","lala","nena","chaco"};
        int count = arregloConLLave.length;
        for(int i =0;i<count;i++) {
            if (arregloConLLave[i].equalsIgnoreCase("lala") || //con esto me salto a lala de la lista con el continue
                    arregloConLLave[i].equalsIgnoreCase("chaco")) // pongo un or  y tambien chaco si esta
                continue;
else {
                System.out.println(i + " " + arregloConLLave[i]); //con esto recorremos los nombres
            }
        }
        String search = JOptionPane.showInputDialog("ingrese un nombre , \"Rodrigo\" o \"Ricardo\"");
        System.out.println("search = " + search);
        boolean encontrado = false;
        for (int i = 0 ; i <count; i++){
            if (arregloConLLave[i].equalsIgnoreCase(search)){
                encontrado=true;
                break;
            }
            System.out.println("nombres = " + arregloConLLave[i]);

        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, search + " fue encontrado");
        }
        else{
            JOptionPane.showMessageDialog(null, search + " no fue encontrado");
        }

        }

    }

