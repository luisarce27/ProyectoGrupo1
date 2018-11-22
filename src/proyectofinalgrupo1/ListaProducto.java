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
            if (p.getCantidad() <= cabeza.getDato().getEpisodios()) {//agregar a la izquierda
                cabeza.setBack(new Nodo(s));
                cabeza.getBack().setNext(cabeza);
                cabeza = cabeza.getBack();

            }else{
                if(s.getEpisodios()>= ultimo.getDato().getEpisodios()){//preguntamos si es mayor en episodios
                    ultimo.setNext(new Nodo(s));
                    ultimo.getNext().setBack(ultimo);
                    ultimo=ultimo.getNext();
                }else{
                    Nodo aux=cabeza;
                    while(s.getEpisodios()> aux.getNext().getDato().getEpisodios()){
                        aux=aux.getNext();
                    }
                    Nodo temp = new Nodo(s);//creamos un nodo temporal
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
      Nodo aux = cabeza.getNext();
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
        Nodo aux = cabeza;
        if (aux != null) {
            if (nombre == aux.getDato().getNombre()) {
                resultado = true;
            } else {
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (nombre == aux.getDato().getNombre()) {
                        resultado = true;
                    }
                    aux = aux.getNext();
                }
            }
        }
        return resultado;
    }
   
   public void modifica(Serie s) {
        Nodo aux = cabeza;
        if (aux != null) {
            if (s.getNombre() == aux.getDato().getNombre()&&s.getEpisodios()==aux.getDato().getEpisodios()) {
                aux.setDato(s);
            } else {
                aux = aux.getNext();
                while (aux != cabeza) {
                    if (s.getNombre() == aux.getDato().getNombre()&&s.getEpisodios()==aux.getDato().getEpisodios()) {
                        aux.setDato(s);
                    }
                    aux = aux.getNext();
                }
            }
        }
    }
   
   public void elimina(String nombre) {
        Nodo aux = cabeza;

        while (aux.getDato().getNombre()!=nombre) {
            if (nombre == aux.getDato().getNombre()) {
                aux.setDato(null);

            }
            aux = aux.getNext();
        }
    }
   
   public String PrintReverse (){
       if  (cabeza != null){
      String msj = cabeza.getDato()+"";
      Nodo aux = cabeza.getNext();
      while (aux != cabeza){
          msj += "\n" + aux;
          aux = aux.getNext();
          
      }
      return msj;
       }
       return "No se agregó nunguna serie";
    }
   
   
   
}

