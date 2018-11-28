/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupo1;


/**
 *
 * @author Home
 */
public class ColaFactura {
    
    private NodoFactura frente, ultimo; 
    
    public void encola (Factura factura){//este metodo añade elementos a la cola
        
        if ( frente == null){
            frente = new NodoFactura(factura);
            ultimo = frente;
   
        } else {
            NodoFactura aux = new NodoFactura(factura); 
            ultimo.setAtras(aux);
            ultimo = aux;    
        }     
    }
    
    int mayor = 0;
    public int encuentraMayor(){
        NodoFactura aux = frente;
        while (aux != null){
            if (aux.getDato().getNumFactura() > mayor){
                mayor = aux.getDato().getNumFactura();
//                aux = aux.getAtras();
            }
            aux = aux.getAtras();
        }
        return mayor;
    }
    
    
    public void printCola() { //Este metodo imprime la cola
        NodoFactura aux = frente;//Se crea e inicializa la variable aux la contiene el primer dato de la cola
        while (aux != null) {// Recorre la pila hasta el ultimo nodo.
            if (aux.getDato() == null){//Si un dato de la pila fue eliminado, no se imprimira en la lista
                aux = aux.getAtras();//Se lo saltan y sigue el ciclo
            }else {
                System.out.println("|\t" + aux.getDato() + "\t|"); // Imprime el dato actual
                System.out.println("-------------------------------------------------------------------------");
                aux = aux.getAtras();//Se sigue buscando en la pila
            }
        }
    }
    
}

