/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author jose-
 */
public class Persona {
    private String apellido;
    private String nombre;
    private Integer numeroDocumento;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Persona() {
    }

    public Persona(String apellido, String nombre, Integer numeroDocumento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
    }
    @Override
    public String toString() {
        return  apellido + " " + nombre + " " + numeroDocumento ;
    }
}
