
package modelo;

import java.util.Date;

public class Venta {
    private Vendedor vendedor;
    private Cliente cliente;
    private Producto producto;
    private int cantidadProducto;
       
    public Venta(Vendedor vendedor, Cliente cliente, Producto producto, int cantidadProducto) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }

  
    public double calcularSubtotal() {
        double subtotal = 0;      
            subtotal += producto.getPrecio();
            subtotal=subtotal*cantidadProducto;
        return subtotal;
    }
    
    public double calcularIGV() {
        double subtotal = calcularSubtotal();
        return subtotal * 0.18;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double igv = calcularIGV();
        return subtotal + igv;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    
}