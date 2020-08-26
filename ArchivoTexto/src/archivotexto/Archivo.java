package archivotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Archivo {
    public void Grabar (String cadena){
        try{
        FileWriter archivo = new FileWriter("datos.txt", true);
        try(BufferedWriter almacen = new BufferedWriter(archivo)){
            almacen.write(cadena + "\n");
            almacen.close();
        }
        archivo.close();
                } catch (Exception ex){}
    }
    
    public ArrayList<String> Leer (){
        ArrayList<String> datos = new ArrayList<>();
        try{
            FileReader archivo = new FileReader ("Datos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            String cadena;
            while ((cadena = lectura.readLine())!=null){
                datos.add(cadena);
            }
        } catch (Exception ex){}
        return datos;
    }
}
