
package modelo;

public class ArregloVentas {
     private Venta ventas[];
     private int indice;

     public ArregloVentas (int tamano) {
        this.ventas = new Venta [tamano];
        this.indice = 0;
     }     
         
       public boolean agregar(Venta venta){
        boolean resultado = false;
        if(!lleno()){
            this.ventas[this.indice] = venta;
            this.indice++; 
        }
        return resultado;
    }

    private boolean lleno() {
        return this.ventas.length == indice;
    }     

     public Venta getVenta(Cliente cliente){
        Venta resultado = null;
        for( Venta p : this.ventas){
            if(p.getCliente().equalsIgnoreCase(cliente)){
                resultado = p;
                break;
            }
        }
        return resultado;
    }

     
}
