/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagranjadebraulio.entidades;

/**
 *
 * @author Agustin
 */
public class Caballo {
    private String nombre;
    private Integer peso;
    private String raza;

    public Caballo() {
    }

    public Caballo(String nombre, Integer peso, String raza) {
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
    
    
}
