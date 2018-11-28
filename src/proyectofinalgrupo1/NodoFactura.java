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
public class NodoFactura {
    
    private Factura dato;
    private NodoFactura atras;

    public NodoFactura(Factura dato) {
        this.dato = dato;
    }

    public Factura getDato() {
        return dato;
    }

    public void setDato(Factura dato) {
        this.dato = dato;
    }

    public NodoFactura getAtras() {
        return atras;
    }

    public void setAtras(NodoFactura atras) {
        this.atras = atras;
    }
    
    @Override
    public String toString() {
        return "" + dato;
    }
    
}
