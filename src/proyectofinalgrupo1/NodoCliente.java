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
public class NodoCliente {
    
    private Clientes dato;
    private NodoCliente next;

    public NodoCliente(Clientes dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Estamos aca" + "y aca" + dato + "aqui tambien" + next + '}';
    }

    public Clientes getDato() {
        return dato;
    }

    public void setDato(Clientes dato) {
        this.dato = dato;
    }

    public NodoCliente getNext() {
        return next;
    }

    public void setNext(NodoCliente next) {
        this.next = next;
    }
    
    
}

