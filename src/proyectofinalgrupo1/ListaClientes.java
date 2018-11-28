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
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaClientes {

    private NodoCliente cabeza, ultimo;

    public int RastreaClientes() {

        int x = 0;
        boolean i = false;
        do {
            try {
                x = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su numero de ID"));
                boolean h = true;
                NodoCliente aux = cabeza;
                while (aux != null) {
                    if (aux.getDato().getID() == x) {
                        h = false;
                    }
                    aux = aux.getNext();
                }
                if (h) {
                    break;
                } else {
                    JOptionPane.showInputDialog(null, "Este ID ya se ingresó");
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Numero de cedula invalido");

            }
        } while (!i);
        return x;
    }

    public void inserta(Clientes a) {
        if (cabeza == null) {
            cabeza = new NodoCliente(a);
            ultimo = cabeza;                     //En el caso de que cabeza no contenga datos, se crea un nuevo nodo con datos

            ultimo.setNext(cabeza);
        } else {
            if (a.getNumeroTel() < cabeza.getDato().getNumeroTel()) {
                NodoCliente aux = new NodoCliente(a);
                aux.setNext(cabeza);                 //  Si la nota del nuevo dato es menor a la nota de cabeza 
                cabeza = aux;                        // el nuevo nodo con datos pasa a ser la cabeza y la cabeza anterior pasa a ser el segundo dato
                ultimo.setNext(cabeza);
            } else {
                if (a.getNumeroTel() >= ultimo.getDato().getNumeroTel()) {
                    NodoCliente aux = new NodoCliente(a);
                    ultimo.setNext(aux);                 //Si la nota del nuevo dato es mayor o igual a la del ultimo nodo
                    ultimo = aux;                    // Se crea un nuevo nodo (el nuevo nodo pasa a ser el ultimo nodo)
                    ultimo.setNext(cabeza);
                } else {
                    NodoCliente aux = cabeza;

                    while (a.getNumeroTel() > aux.getNext().getDato().getNumeroTel()) {
                        aux = cabeza.getNext();                  //Si la nota del nuevo dato es mayor a la nota del siguiente dato
                    }
                    NodoCliente temp = new NodoCliente(a);            //Se crea un nuevo nodo
                    temp.setNext(aux.getNext());        //El temporal se va a crear entre cada nodo, el siguiente del nodo temporal va a ser el siguiente del nodo auxiliar
                    aux.setNext(temp);                  // Y el que sigue de auxiliar es ahora temp - Esto ingresa satisfactoriamente el nodo entre un nodo y otro. 
                }
            }
        }
    }

    @Override
    public String toString() {
        String mensaje = "";
        NodoCliente aux = cabeza;

        if (aux != null) {
            mensaje += aux + "\n";                  //metodo solamente para imprimir la lista
            aux = aux.getNext();
            while (aux != cabeza) {
                mensaje += aux + "\n";
                aux = aux.getNext();
            }
        } else {
            mensaje += "vacia";
        }
        return mensaje;

    }

    public void actualizaNombre() {

        NodoCliente aux = cabeza;

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente a cambiar la nota");     //Se solicitan los datos para iniciar la busqueda
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente:"));

        if (aux != null) /// Esta condicion es para buscar en la cabeza
        {
            if (aux.getDato().getNombre().equals(nombre) && aux.getDato().getID() == id) // Y se recorren los datos ingresados
            {
                int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente"));      //Si se encuentran los datos regidtrados en la cabeza
                aux.getDato().setNumeroTel(nota);                                                                           // se procede a preguntar por la nueva nota
                aux = aux.getNext();               //continua al siguiente nodo
            }

            aux = aux.getNext();

            while (aux != cabeza) //Recorre la lista despues de seguir con la cabeza
            {
                if (aux.getDato().getNombre().equals(nombre) && aux.getDato().getID() == id) {                                                                                                    //Igual se pide la nueva nota del estudiante para cambiarla. 
                    int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente"));
                    aux.getDato().setNumeroTel(nota);                                                                      //nota actualizada 
                    aux.getNext();
                }
                aux = aux.getNext();

            }
        }
    }

    public void elimina() {   //Metodo para eliminar

        NodoCliente aux = cabeza;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente a remover"));

        if (aux != null) {
            if (aux.getDato().getID() == id) {                                                // Este es para eliminar el dato de la cabeza si quisiera removerse
                aux.setDato(null);
                aux = aux.getNext();
            }

            System.out.println(aux);    //Se imprime el nodo 
            aux = aux.getNext();       //Se pasa de nodo al siguiente de aux

            while (aux != cabeza) {
                if (aux.getDato().getID() == id) {
                    aux.setDato(null);                  //Este ciclo es para eliminar cualquier dato que no este en la cabeza
                    aux = aux.getNext();            //Se setea a null y 
                }                                 // Se pasa al siguiente nodo
                System.out.println(aux);       //Se imprime el nodo
                aux = aux.getNext();

            }
        }
    }

}