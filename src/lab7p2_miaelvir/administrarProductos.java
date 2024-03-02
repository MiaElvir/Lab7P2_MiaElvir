/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_miaelvir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class administrarProductos {
    
    public ArrayList<Producto> productos = new ArrayList<>(); 
    protected File archivo = null; 

    public administrarProductos(String path) {
        archivo = new File(path); 
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Producto t : productos) {
                bw.write(t.getId()+ ",");
                bw.write(t.getNombre() + ",");
                bw.write(t.getCategoria()+ ",");
                bw.write(t.getPrecio()+ ",");
                bw.write(t.getAisle()+ ",");
                bw.write(t.getBin());
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
     public void cargarArchivo() {
        Scanner sc = null;
        productos = new ArrayList();
        if (archivo.exists()) {
            System.out.println("p");
            try {
                System.out.println("k");
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    System.out.println("ñ");
//                    productos.add(new Producto(sc.nextInt(),
//                            sc.nextInt(), sc.nextInt(), sc.nextInt(),
//                            sc.nextLine(), sc.nextDouble())
                    //);
                    System.out.println(sc.nextInt()+","+sc.nextLine());
                    System.out.println(productos.get(0).getId());
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
}
