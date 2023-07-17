
package modelo;


public class ArregloPersonas {
     private Persona personas[];
     private int indice;

    public ArregloPersonas (int tamano) {
        this.personas = new Persona[tamano];
        this.indice = 0;
    }
    
    public boolean agregar(Persona persona){
        boolean resultado = false;
        if(!lleno()){
            this.personas[this.indice] = persona;
            this.indice++; 
        }
        return resultado;
    }

    private boolean lleno() {
        return this.personas.length == indice;
    }
    
    public Persona getPersona(String dni){
        Persona resultado = null;
        for( Persona p : this.personas){
            if(p.getDni().equalsIgnoreCase(dni)){
                resultado = p;
                break;
            }
        }
        return resultado;
    }

    
     public Vendedor[] getVendedor(){
        Vendedor resultado[] = new Vendedor[100];//Vendedor resultado[] = null;
        int i=0;
        for( Persona p : this.personas){
            if(p instanceof Vendedor){
                resultado[i] = (Vendedor) p;
                i++; 
            }
        }    
        return resultado;
    } 
     
    public Vendedor validar(String usuario, String clave){
           Vendedor resultado = null;
            for(Vendedor u : getVendedor()){
                if(u != null && u.validar(usuario, clave)){
                    resultado = u;
                    break;
                }        
            }
              return resultado;
    }

         
        
    @Override
    public String toString() {
        String resultado = "";
        for( Persona p : this.personas){
            if(p!= null){
                resultado += p+"\n";
            }        
        }
        return resultado;
            
    }

    
}
