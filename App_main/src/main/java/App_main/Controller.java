package App_main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.NetPermission;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Controller {
    Vista vista;
    //para escribir el archivo:
    Escribir escribir;
    File archivo;
    
    public Controller(){
        vista= new Vista();
        escribir= new Escribir();

    }

    public void leerArchivo() {
        App app = new App();
        String rootPath = app.getClass().getResource("App.class").getPath()
                .replaceAll("App.class", "");
        System.out.println(rootPath);
        File file = new File(rootPath + "../" + "operaciones.txt");
        try {
            Scanner leer_archivo = new Scanner(file);

            while (leer_archivo.hasNextLine()) {
                String data = leer_archivo.nextLine();
                System.out.println(data);

            }
            vista.SeAbrioArchivo();
            leer_archivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir el archivo" + e);

        }
    }
    public void EscribirArchivo(String expresion){
        App app = new App();
        String rootPath = app.getClass().getResource("App.class").getPath()
                .replaceAll("App.class", "");
        archivo= new File(rootPath + "../" + "operaciones.txt");
        String nombre_archivoString= (rootPath + "../" + "operaciones.txt");;//(rootPath + "../" + "operaciones.txt");
        try{
            //System.out.println("bandera 1");
            if (archivo.exists()){
                try{
                    //System.out.println("bandera 2");
                    escribir.Escritura(nombre_archivoString,expresion);
                    System.out.println("se escribió la expresion");
                }catch(Exception e){
                    System.out.println("Excepcion"+ e);
                }
    
            }else{
                System.out.println("debe de crear el archivo");
               }
    
        }catch(Exception e){
            System.out.println("Excepcion"+ e);
        }
        
        
    }
}