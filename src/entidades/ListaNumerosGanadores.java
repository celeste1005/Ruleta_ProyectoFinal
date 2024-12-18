/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author gta_2
 */
public class ListaNumerosGanadores {
    private ArrayList<Integer> numerosGanadores;

    public ListaNumerosGanadores() {
        numerosGanadores = new ArrayList<>();
    }

    public void agregarNumeroGanador(int numero) {
        numerosGanadores.add(numero);
    }

    public ArrayList<Integer> obtenerNumerosGanadores() {
        return numerosGanadores;
    }

}
