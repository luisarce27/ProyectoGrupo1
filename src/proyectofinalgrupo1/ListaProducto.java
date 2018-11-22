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
public class ListaProducto {
    
 private NodoProducto cabeza, ultimo;
 
 public void insertar(Producto p) {
        if (cabeza == null) {//preguntamos si es nulo
            cabeza = new NodoProducto(p);
            ultimo = cabeza;

        } else {
            if (p.getCantidad() <= cabeza.getDato().getCantidad()) {//agregar a la izquierda
                cabeza.setBack(new NodoProducto(p));
                cabeza.getBack().setNext(cabeza);
                cabeza = cabeza.getBack();

            }else{
                if(p.getCantidad()>= ultimo.getDato().getCantidad()){//preguntamos si es mayor en episodios
                    ultimo.setNext(new NodoProducto(p));
                    ultimo.getNext().setBack(ultimo);
                    ultimo=ultimo.getNext();
                }else{
                    NodoProducto aux=cabeza;
                    while(p.getCantidad()> aux.getNext().getDato().getCantidad()){
                        aux=aux.getNext();
                    }
                    NodoProducto temp = new NodoProducto(p);//creamos un nodo temporal
                    temp.setNext(aux.getNext());//temp tiene como siguiente a el nodo siguinte del aux
                    temp.setBack(aux);//seteo que temp tiene como back a aux
                    aux.setNext(temp);
                    temp.getNext().setBack(temp);
                }
            }

        }
        ultimo.setNext(cabeza);//ultimo tiene como siguiente cabeza
        cabeza.setBack(ultimo);//cabeza tiene como siguinte ultimo
    }//fin metodo inserta
   public String print (){
       if  (cabeza != null){
      String msj = cabeza.getDato()+"";
      NodoProducto aux = cabeza.getNext();
      while (aux != cabeza){
          msj += "\n" + aux;
          aux = aux.getNext();
          
      }
      return msj;
       }
       return "No se agregó nada a la lista";
    }
   
   public boolean existe(String nombre) { // Metodo de existe con bo
        boolean resultado = false;
        NodoProducto aux = cabeza;
        if (aux != null) {
            if (nombre == aux.getDato().getNombreProducto()) {
                resultado = true;
            } else {
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (nombre == aux.getDato().getNombreProducto()) {
                        resultado = true;
                    }
                    aux = aux.getNext();
                }
            }
        }
        return resultado;
    }
   
   public void modifica(Producto s) {
        NodoProducto aux = cabeza;
        if (aux != null) {
            if (s.getNombreProducto() == aux.getDato().getNombreProducto()) {
                aux.setDato(s);
            } else {
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (s.getNombreProducto() == aux.getDato().getNombreProducto()) {
                        aux.setDato(s);
                    }
                    aux = aux.getNext();
                }
            }
        }
    }
   
   public void elimina(String nombre) {
        NodoProducto aux = cabeza;

        while (aux.getDato().getNombreProducto()!=nombre) {
            if (nombre == aux.getDato().getNombreProducto()) {
                aux.setDato(null);

            }
            aux = aux.getNext();
        }
    }
   
   public String PrintReverse (){
       if  (cabeza != null){
      String msj = cabeza.getDato()+"";
      NodoProducto aux = cabeza.getNext();
      while (aux != cabeza){
          msj += "\n" + aux;
          aux = aux.getNext();
          
      }
      return msj;
       }
       return "No se agregó nunguna serie";
    }
   
   
   
}

