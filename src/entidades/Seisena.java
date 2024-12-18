/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gta_2
 */
public class Seisena {
    private int inicioRango;
    private int pagoPorAcierto = 5;
    
    public Seisena(int inicioRango) {
        if (inicioRango < 1 || inicioRango > 31 || inicioRango % 3 != 1) {
            throw new IllegalArgumentException("El número inicial debe ser 1, 4, 7,..., 31.");
        }
        this.inicioRango = inicioRango;
    }

    public int getInicioRango() {
        return inicioRango;
    }

    public void setInicioRango(int inicioRango) {
        this.inicioRango = inicioRango;
    }
    
    public boolean verificarApuesta(int numeroGanador) {
        return numeroGanador >= inicioRango && numeroGanador < inicioRango + 6;
    }

    public int calcularGanancia(int montoApostado) {
        return montoApostado * pagoPorAcierto;
    }

    @Override
    public String toString() {
        return "Seisena: [" + inicioRango + " - " + (inicioRango + 5) + "]";
    }
}
