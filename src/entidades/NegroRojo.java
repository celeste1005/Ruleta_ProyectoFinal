/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gta_2
 */
public class NegroRojo {

    private static final int[] ROJOS = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private static final int[] NEGROS = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

    public static String obtenerColor(int numero) {
        if (numero == 0) {
            return "Verde";
        }
        for (int rojo : ROJOS) {
            if (rojo == numero) {
                return "Rojo";
            }
        }
        for (int negro : NEGROS) {
            if (negro == numero) {
                return "Negro";
            }
        }
        return "Desconocido";
    }

    public static boolean esRojo(int numero) {
        for (int rojo : ROJOS) {
            if (rojo == numero) {
                return true;
            }
        }
        return false;
    }

    public static boolean esNegro(int numero) {
        for (int negro : NEGROS) {
            if (negro == numero) {
                return true;
            }
        }
        return false;
    }
}
