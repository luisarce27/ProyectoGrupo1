/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalgrupo1;

import java.sql.Timestamp;

/**
 *
 * @author Home
 */
public class Factura {
    
    private String Cliente; 
    
    ColaFactura cola = new ColaFactura();
    int numFactura = cola.encuentraMayor()+ 1;
    
    double total; 
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());;
    private Timestamp fecha = timestamp;
    private static String local = "Escazú", sociedad = "GUCHAR S.A.", cedulaJuridica = "1-301-1135487"; 

    public Factura(String Cliente, double total) {
        this.Cliente = Cliente;
        this.total = total;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Timestamp getFecha() {
        return fecha;
    }
    
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public static String getLocal() {
        return local;
    }

    public static void setLocal(String local) {
        Factura.local = local;
    }

    public static String getSociedad() {
        return sociedad;
    }

    public static void setSociedad(String sociedad) {
        Factura.sociedad = sociedad;
    }

    public static String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public static void setCedulaJuridica(String cedulaJuridica) {
        Factura.cedulaJuridica = cedulaJuridica;
    }

    @Override
    public String toString() {
        return "Cliente: " + Cliente + " Factura:" + numFactura + " Total: " + total + " Fecha: " + fecha + " " + sociedad+ " "+ 
                "Cedula Jurídica: " +cedulaJuridica + " Sede: " +local;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
