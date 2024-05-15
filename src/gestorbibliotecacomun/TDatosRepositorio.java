/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbibliotecacomun;

import java.util.ArrayList;

/**
 *
 * @author alepd
 */
public class TDatosRepositorio {
    private String nombre;
    private String direccion;
    private int numLibros;

    public TDatosRepositorio(String nombre, String direccion, int numLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numLibros = numLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }
    
    
}
