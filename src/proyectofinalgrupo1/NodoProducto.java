/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupo1;

/**
 *
 * @author luisa
 */
public class NodoProducto {
    
private NodoProducto next,back;
private Producto dato;

    public NodoProducto(Producto dato) {
        this.dato = dato;
    }

    public NodoProducto getNext() {
        return next;
    }

    public void setNext(NodoProducto next) {
        this.next = next;
    }

    public NodoProducto getBack() {
        return back;
    }

    public void setBack(NodoProducto back) {
        this.back = back;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "{" + "dato=" + dato + '}';
    }

      
    
}
