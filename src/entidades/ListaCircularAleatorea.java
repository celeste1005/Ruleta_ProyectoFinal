/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Random;

public class ListaCircularAleatorea {
    private Nodo L;
    
    public ListaCircularAleatorea(){
        L = null;
    }
    
    public boolean esVacia(){
        if(L==null)
            return true;
        else
            return false;
    }

    public void agregar(int x){
        Nodo nv = new Nodo(x);
        if(L==null){
            L=nv;
            L.setSgte(L);
        }else{
            nv.setSgte(L.getSgte());
            L.setSgte(nv);
            L=nv;
        }
    }

  /* public int girar() {  //Corregir método con lo implementado
        if (cabeza == null) return -1;

        Random random = new Random();
        int pasos = random.nextInt(37); 

        Nodo temp = cabeza;
        for (int i = 0; i < pasos; i++) {
            temp = temp.siguiente;
        }
        return temp.numero;
    }*/
}
