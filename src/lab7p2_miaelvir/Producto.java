/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_miaelvir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    protected int id, categoria, aisle, bin; 
    protected String nombre; 
    protected Double precio;

    public Producto(int id, int categoria, int aisle, int bin, String nombre, Double precio) {
        this.id = id;
        this.categoria = categoria;
        this.aisle = aisle;
        this.bin = bin;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", categoria=" + categoria + ", aisle=" + aisle + ", bin=" + bin + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public static boolean validacionCategory(int x){
        if (x >= 0 && x < 10) {
            return true; 
        }
        return false; 
        
    }
    
    public static boolean validacionAisleyBin(int x){
        if (x > 99 && x < 1000) {
            return true; 
        }
        return false; 
        
    }
    
    
    
}
