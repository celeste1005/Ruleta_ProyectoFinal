/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.EmptyStackException;

/**
 *
 * @author gta_2
 */
public class PilaGenerica<T> {
    private NodoPila<T> cima;
    private int tamaño;

    public PilaGenerica() {
        this.cima = null;
        this.tamaño = 0;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public void apilar(T elemento) {
        NodoPila<T> nuevoNodo = new NodoPila<>(elemento, cima);
        cima = nuevoNodo;
        tamaño++;
    }
    
    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T elemento = cima.getElemento();
        cima = cima.getSiguiente();
        tamaño--;
        return elemento;
    }
    
    public T cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return cima.getElemento();
    }
}
