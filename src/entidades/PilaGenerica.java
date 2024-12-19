/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.DefaultListModel;

/**
 *
 * @author gta_2
 */
public class PilaGenerica<T> {
     private Nodo<T> L;

    public PilaGenerica() {
        this.L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public void push(T x) {
        Nodo<T> nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }

    public T pop() {
        T x;
        x = L.getInfo();
        L = L.getSgte();
        return x;
    }

    public T top() {
        return L.getInfo();
    }

    public void clear() {
        while (L != null) {
            L = L.getSgte();
        }
    }

    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getInfo());
            p = p.getSgte();
        }
    }
}
