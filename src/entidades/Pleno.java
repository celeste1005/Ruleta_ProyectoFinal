/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gta_2
 */
public class Pleno {
    private int numeroApostado; // Número seleccionado para realizar la apuesta
    private int pagoPorAcierto = 35; // Es 35 veces el valor apostado.

    public Pleno(int numeroApostado) {
        if (numeroApostado < 0 || numeroApostado > 36) {
            throw new IllegalArgumentException("El número apostado debe estar entre 0 y 36.");
        }
        this.numeroApostado = numeroApostado;
    }

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public boolean verificarApuesta(int numeroGanador) {
        return this.numeroApostado == numeroGanador;
    }

    public int calcularGanancia(int montoApostado) {
        return montoApostado * pagoPorAcierto;
    }
}
