package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorArchivos {
    public static void crearDirectorio(String ruta) {
        Path rutaDirectorio = Paths.get(ruta);
        try{
            if(!Files.exists(rutaDirectorio)){
                Files.createDirectory(rutaDirectorio);
            }else{
                System.out.println("El directorio ya fue creado");
            }
        }catch(IOException e){
            System.out.println("El directorio no se pudo crear");
        }

    }

    public static void crearArchivo(String ruta, String contenido) {
        Path rutaArchivo = Paths.get(ruta);
        try{
            Files.write(rutaArchivo,contenido.getBytes());
            if(!Files.exists(rutaArchivo)){
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("El archivo no pudo ser creado");
        }

    }

    public static String leerArchivo(String ruta) {
        Path rutaArchivo = Paths.get(ruta);
        String contenido = "";
        try{
            contenido = new String(Files.readAllBytes(rutaArchivo));
        }catch (IOException e){
            System.out.println("El archivo no puede ser leido");
        }
        return  contenido;
    }
}