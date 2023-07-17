
package modelo;

public class Persona {
   private String nombre;
   private String apellidos;
   private String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return this.dni ;
    }

    @Override
    public String toString() {
        return "\n Nombre=" + nombre + "\n apellidos=" + apellidos + "\n dni=" + dni + '}';
    }

    
   
}
