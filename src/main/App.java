
package main;

import modelo.ArregloPersonas;
import modelo.ArregloProductos;
import modelo.Cliente;
import modelo.Panaderia;
import modelo.Producto;
import modelo.Vendedor;
import modelo.Venta;

public class App {
    public static void main(String[] args) {
        
        // Crear la panadería
        Panaderia panaderia = new Panaderia(" Super ", "Av. La Molina ", "+51 992 995 428");
                
        ArregloPersonas personas = new ArregloPersonas(100);
            // Agregar vendedor
       personas.agregar(new Vendedor("Esteban", "Quinonez", "11111111", "esteban.quinonez", "123"));              
             // Agregar cliente
       personas.agregar(new Cliente("Jorge", "Zavaleta", "98765432"));
        
  
        ArregloProductos productos = new ArregloProductos(100);

         // Agregar los productos
        productos.agregar (new Producto("Pan", 1.5));
        productos.agregar (new Producto("Torta", 20.0));
        productos.agregar (new Producto("Galletas", 5.0));
        productos.agregar (new Producto("Leche",8.0));
      
  
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
