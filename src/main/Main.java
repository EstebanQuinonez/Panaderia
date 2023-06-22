
package main;

import panaderia.Cliente;
import panaderia.Panaderia;
import panaderia.Producto;
import panaderia.Venta;

public class Main {
    public static void main(String[] args) {
        // Crear la panadería
        Panaderia panaderia = new Panaderia(" Ositos ", "Av. La Molina ", "+51 992 995 428");

        // Crear el cliente
        Cliente cliente = new Cliente("Esteban", "77113532");
        
         // Crear los productos
        Producto pan = new Producto("Pan", 1.5);
        Producto torta = new Producto("Torta", 20.0);
        Producto galletas = new Producto("Galletas", 5.0);
        Producto leche = new Producto("Leche",8.0);
        
        // Realizar una venta (lo que me pida el cliente)
        Venta venta = new Venta(cliente);
        venta.agregarProducto(pan, 2);
        venta.agregarProducto(torta, 1);
        venta.agregarProducto(galletas, 3);
        venta.agregarProducto(leche, 2);

        // Generar la boleta
        String boleta = venta.generarBoleta();

        // Imprimir la boleta
        System.out.println(boleta);
}
    
    
}
