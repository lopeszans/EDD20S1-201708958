package edd_1s_2020_tarea1;

import java.util.Scanner;

public class Matriz {

    public void ejecutarMatriz() {
        Scanner reader = new Scanner(System.in);
        int numeroFilas = 0;
        int numeroColumnas = 0;

        System.out.println("INTRODUCE EL NUMERO DE FILAS");
        numeroFilas = reader.nextInt();

        System.out.println("INTRODUCE EL NUMERO DE COLUMNAS");
        numeroColumnas = reader.nextInt();

        System.out.println("\n"+ "\n");
        String matriz[][] = new String[numeroFilas][numeroColumnas];

        for (int x = 0; x < matriz.length; x++) {

            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = "1";

            }

        }

        for (int x = 0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
}
