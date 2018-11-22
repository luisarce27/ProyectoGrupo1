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
public class Producto {
    
    String NombreProducto,Tipo,Marca;
    float Precio;
    int Cantidad;

    public Producto(String NombreProducto, String Tipo, String Marca, float Precio, int Cantidad) {
        this.NombreProducto = NombreProducto;
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "NombreProducto=" + NombreProducto + ", Tipo=" + Tipo + ", Marca=" + Marca + ", Precio=" + Precio + ", Cantidad=" + Cantidad + '}';
    }
      
    
}
