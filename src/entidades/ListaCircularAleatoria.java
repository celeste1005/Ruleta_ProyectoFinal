/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class ListaCircularAleatoria<T> {

    private Nodo L;

    public ListaCircularAleatoria() {
        this.L = null;
    }

    public boolean esVacia() {
        return L == null;
    }

    public void insertar(T x) {
        Nodo nuevo = new Nodo(x);
        if (esVacia()) {
            L = nuevo;
            L.setSgte(L);
            L.setAnt(L);
        } else {
            nuevo.setSgte(L.getSgte());
            nuevo.setAnt(L);
            L.getSgte().setAnt(nuevo);
            L.setSgte(nuevo);
            L = nuevo;
        }
    }

    public Nodo buscar(T x) {
        if (esVacia()) {
            return null;
        } else {
            Nodo p = L.getSgte();
            do {
                if (p.getInfo() == x) {
                    return p;
                } else {
                    p = p.getSgte();
                }
            } while (p != L.getSgte());
            return null;
        }
    }

    public int contar() {
        int c = 0;
        if (esVacia()) {
            return c;
        } else {
            Nodo p = L.getSgte();
            do {
                c++;
                p = p.getSgte();
            } while (p != L.getSgte());
            return c;
        }
    }

    public boolean eliminar(T x) {
        if (esVacia()) {
            return false;
        } else {
            Nodo p = L.getSgte();
            if (p.getInfo() == x) {
                if (p == p.getSgte()) {
                    L = null;
                } else {
                    L.setSgte(p.getSgte());
                    p.getSgte().setAnt(L);
                }
                return true;
            } else {
                p = p.getSgte();

                do {
                    if (p.getInfo() != x) {
                        p = p.getSgte();
                    }
                } while (p != L.getSgte() && p.getInfo() != x);

                if (p == L.getSgte()) {
                    return false;
                } else {
                    p.getAnt().setSgte(p.getSgte());
                    p.getSgte().setAnt(p.getAnt());
                    if (p == L) {
                        L = p.getAnt();
                    }
                    return true;
                }
            }
        }
    }

    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        if (!esVacia()) {
            Nodo p = L.getSgte();
            do {
                modelo.addElement(p.getInfo());
                p = p.getSgte();
            } while (p != L.getSgte());
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        int cantidad = contar();

        if (cantidad == 0) {
            modelo.setRowCount(0);
            return;
        }

        Object[][] datos = new Object[cantidad][2];
        String[] titulos = {"Número", "Apuesta"};

        Nodo p = L.getSgte();
        int i = 0;
        do {
            Apuesta apuesta = (Apuesta) p.getInfo();

            datos[i][0] = apuesta.getNumero();
            datos[i][1] = apuesta.getApuesta();
            i++;
            p = p.getSgte();
        } while (p != L.getSgte());

        modelo.setDataVector(datos, titulos);
    }
}
