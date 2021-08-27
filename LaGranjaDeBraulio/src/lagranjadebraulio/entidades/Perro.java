/*
*
*/

package lagranjadebraulio.entidades;

public class Perro {
    
    private String nombre;
    private Integer peso;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, Integer peso, String raza) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", peso=" + peso + ", raza=" + raza + '}';
    }
    
    
    
}
