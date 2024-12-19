/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gta_2
 */
public class Nodo<T> {
    private T info;
    private Nodo sgte;
    private Nodo ant;
    
    public Nodo(){
        sgte = null;
        ant = null;
    }
    
    public Nodo(T x){
        info = x;
        sgte = null;
        ant = null;
    }
    
    public Nodo(T x, Nodo sig, Nodo ante){
        info = x;
        sgte = sig;
        ant = ante;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}
