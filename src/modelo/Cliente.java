
package modelo;
public class Cliente extends Persona{
       private String telefono;

    public Cliente(String nombre, String apellidos, String dni, String telefono) {
        super(nombre, apellidos, dni);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    boolean equalsIgnoreCase(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
