
package modelo;

public class Login {
    private String usuario;
    private String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean validar(String usuario, String clave){
        boolean resultado = false;
        if(this.usuario.equalsIgnoreCase(usuario) &&
                this.clave.equals(clave)){
            resultado = true;
        }
        return resultado;
    }
    
    
}