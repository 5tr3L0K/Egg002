

package lagranjadebraulio.entidades;


public class Pato {
    private String nombre;
    private String raza;

    public Pato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Pato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Pato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
}
