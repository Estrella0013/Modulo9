/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

/**
 *
 * @author Estrella
 */
public class alumno {
    String cuenta;
    String Nombre;
    String apellido; 
    String carrera;

    public alumno() {
    }

    public alumno(String cuenta, String Nombre, String apellido, String carrera) {
        this.cuenta = cuenta;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
}
