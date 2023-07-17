
package main;

import controlador.ControladorLogin;
import modelo.ArregloPersonas;
import modelo.ArregloProductos;
import modelo.ArregloVentas;
import modelo.Cliente;
import modelo.Panaderia;
import modelo.Producto;
import modelo.Vendedor;
import modelo.Venta;
import vista.frmIngreso;

public class App {
    public static void main(String[] args) {
       
        ArregloPersonas personas = new ArregloPersonas(100);
        frmIngreso fIngreso = new frmIngreso();
            
            
        // Crear la panadería
        Panaderia panaderia = new Panaderia(" Super ", "Av. La Molina ", "+51 992 995 428");
               
            
        // Agregar vendedor
       Vendedor vendedor1 = new Vendedor("Esteban", "Quinonez", "11111111", "esteban.quinonez", "123");
       Vendedor vendedor2 = new Vendedor("Sergio", "Quiroz", "22222222", "sergio.quiroz", "111");

       personas.agregar(vendedor1);  
       personas.agregar(vendedor2);  
    
       ControladorLogin controlador = new ControladorLogin(personas, fIngreso);
       controlador.iniciar();
      
       
       
       
       /*
        // Agregar cliente
       Cliente cliente1 =  new Cliente("Jorge", "Zavaleta", "98765432","999999999");    
       Cliente cliente2 = new Cliente("Pedro", "Garcia", "11111432", "888888888");
       
       personas.agregar(cliente1);
       personas.agregar(cliente2);
 
  
        ArregloProductos productos = new ArregloProductos(100);

         // Agregar los productos
         Producto producto1= new Producto("Pan", 1.5);
         Producto producto2= new Producto("Torta", 20.0);
         Producto producto3= new Producto("Galletas", 5.0);
         Producto producto4= new Producto("Leche",8.0);

         
        productos.agregar (producto1);
        productos.agregar (producto2);
        productos.agregar (producto3);
        productos.agregar (producto4);
      
        
         // Realizar una venta (lo que me pida el cliente)
        ArregloVentas ventas = new ArregloVentas(100);
            Venta venta1 = new Venta (vendedor1,cliente1,producto1,2 ); 
            Venta venta2 = new Venta (vendedor1,cliente2,producto3,1 ); 
        
         ventas.agregar (venta1);
         ventas.agregar (venta2);
       
 */
    }    
} 
