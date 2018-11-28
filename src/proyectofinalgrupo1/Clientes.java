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
public class Clientes {
    
    private int ID, numeroTel;
    private String Nombre, correo;

    public Clientes(int ID, int numeroTel, String Nombre, String correo) {
        this.ID = ID;
        this.numeroTel = numeroTel;
        this.Nombre = Nombre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Datos cliente \n" + "ID=" + ID + " | numeroTel: " + numeroTel + " | Nombre: " + Nombre + " | correo: " + correo + "\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
