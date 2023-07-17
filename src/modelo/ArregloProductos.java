

package modelo;


public class ArregloProductos {
    private Producto productos[];
     private int indice;

     public ArregloProductos (int tamano) {
        this.productos = new Producto[tamano];
        this.indice = 0;
     }     
         
       public boolean agregar(Producto producto){
        boolean resultado = false;
        if(!lleno()){
            this.productos[this.indice] = producto;
            this.indice++; 
        }
        return resultado;
    }

    private boolean lleno() {
        return this.productos.length == indice;
    }     

    
}
