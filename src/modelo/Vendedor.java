
package modelo;

public class Vendedor extends Persona{
    private Login login;

    public Vendedor(String nombre, String apellidos, String dni, String usuario, String clave) {
        super(nombre, apellidos, dni);
        this.login = new Login(usuario, clave);
    }
     
 public boolean validar(String usuario, String clave){
        return this.login.validar(usuario, clave);
    }

    public Login getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "login=" + login + '}';
    }
    
}


