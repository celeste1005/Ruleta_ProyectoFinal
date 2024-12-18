/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gta_2
 */
public class NegroRojo {
    private static final Set<Integer> NUMEROS_ROJOS = new HashSet<>();
    private static final Set<Integer> NUMEROS_NEGROS = new HashSet<>();
    private String colorApostado; //"rojo" o "negro, o "ROJO" o "NEGRO"
    private int pagoPorAcierto = 1;

    static {
        int[] numerosRojos = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        int[] numerosNegros = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

        for (int num : numerosRojos) {
            NUMEROS_ROJOS.add(num);
        }
        for (int num : numerosNegros) {
            NUMEROS_NEGROS.add(num);
        }
    }

    public NegroRojo(String colorApostado) {
        if (!colorApostado.equalsIgnoreCase("rojo") && !colorApostado.equalsIgnoreCase("negro")) {
            throw new IllegalArgumentException("El color apostado debe ser 'rojo' o 'negro'.");
        }
        this.colorApostado = colorApostado.toLowerCase();
    }

    public String getColorApostado() {
        return colorApostado;
    }

    public void setColorApostado(String colorApostado) {
        if (!colorApostado.equalsIgnoreCase("rojo") && !colorApostado.equalsIgnoreCase("negro")) {
            throw new IllegalArgumentException("El color apostado debe ser 'rojo' o 'negro'.");
        }
        this.colorApostado = colorApostado.toLowerCase();
    }

    public boolean verificarApuesta(int numeroGanador) {
        if (colorApostado.equals("rojo")) {
            return NUMEROS_ROJOS.contains(numeroGanador);
        } else {
            return NUMEROS_NEGROS.contains(numeroGanador);
        }
    }

    public int calcularGanancia(int montoApostado) {
        return montoApostado * pagoPorAcierto;
    }

    @Override
    public String toString() {
        return "Apuesta al color: " + colorApostado;
    }
}
