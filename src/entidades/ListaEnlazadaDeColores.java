/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gta_2
 */
public class ListaEnlazadaDeColores<T> {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaEnlazadaDeColores(){
        primero = null;
        ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia(){
        if(primero==null && ultimo==null)
            return true;
        else 
            return false;
    }
    
    public void agregarAlFinal(T v){
        Nodo nv = new Nodo(v);
        if(primero==null){
            nv.setSgte(null);
            nv.setAnt(null);
            primero=nv;
            ultimo=nv;
        }
        else{
            nv.setSgte(null);
            nv.setAnt(ultimo);
            ultimo.setSgte(nv);
            ultimo=nv;
        }
    }
    
    public void agregarAlInicio(T v){
        Nodo nv = new Nodo(v);
        if(primero==null){
            nv.setSgte(null);
            nv.setAnt(null);
            primero=nv;
            ultimo=nv;
        }
        else{
            nv.setSgte(primero);
            nv.setAnt(null);
            primero.setAnt(nv);
            primero=nv;
        }
    }

    public Nodo buscarColor (T numero){
        Nodo p=primero;
        while(p!=null){
            if(p.getInfo()== numero)
                return p;
            p=p.getSgte();
        }
        return null;
    }
}
