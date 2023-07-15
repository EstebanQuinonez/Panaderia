
package modelo;

import java.util.Date;

public class Venta {
    private Vendedor vendedor;
    private Cliente cliente;
    private Producto producto;
    private int cantidadProducto;
    private Date fecha;

    public Venta(Vendedor vendedor, Cliente cliente, Producto producto, int cantidadProducto, Date fecha) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
    }
  
  
    
    public double calcularSubtotal() {
        double subtotal = 0;
        
        for (int i = 0; i < cantidadProducto; i++) {
            Producto producto = productos[i];
            subtotal += producto.getPrecio();
        }

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
}