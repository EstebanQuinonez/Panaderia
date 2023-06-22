
package panaderia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Venta(Cliente cliente) {
        this.fecha = new Date();
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            productos.add(producto);
            total += producto.getPrecio();
        }
    }

    public double calcularTotal() {
        return total;
    }

    public String generarBoleta() {
        
        StringBuilder boleta = new StringBuilder();
        
        boleta.append("========== Boleta  de Venta Electronica ==========\n");
        boleta.append("Fecha: ").append(fecha).append("\n");
        boleta.append("Cliente: ").append(cliente.getNombre()).append("\n");
        boleta.append("DNI: ").append(cliente.getDni()).append("\n\n");
        boleta.append("Productos:\n");
        
        // mostrar los productos
        for (Producto producto : productos) {
            boleta.append("+ ").append(producto.getNombre()).append(": $").append(producto.getPrecio()).append("\n");
        }
        
        // mostrat monto total a pagar
        boleta.append("\nTotal: $").append(total).append("\n");
        boleta.append("======================================");

        return boleta.toString();
    }
    
}
