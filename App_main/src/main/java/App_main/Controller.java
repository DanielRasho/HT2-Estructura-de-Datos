package App_main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    Vista vista;
    //para escribir el archivo:
    Escribir escribir;
    File archivo;
    App app;
    String rootPath;
    File file;
    String data;
    Scanner leer_archivo;
    
    public Controller(){
        vista= new Vista();
        escribir= new Escribir();
        app = new App();
        rootPath = app.getClass().getResource("App.class").getPath()
                .replaceAll("App.class", "");
        file = new File(rootPath + "../" + "operaciones.txt");
        

    }

    public String leerArchivo() {
        //System.out.println(rootPath);
        try {
            Scanner leer_archivo = new Scanner(file);

            while (leer_archivo.hasNextLine()) {
                data = leer_archivo.nextLine();
                System.out.println(data);
                
            }
            vista.SeAbrioArchivo();
            leer_archivo.close();
            

        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir el archivo" + e);

        }
        return data;
    }
    public void EscribirArchivo(String expresion){
        archivo= new File(rootPath + "../" + "operaciones.txt");
        String nombre_archivoString= (rootPath + "../" + "operaciones.txt");;//(rootPath + "../" + "operaciones.txt");
        try{
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
    public String RetornarExpresion(){
        try {
            Scanner leer_archivo = new Scanner(file);

            while (leer_archivo.hasNextLine()) {
                data = leer_archivo.nextLine();
                
            }
            vista.SeAbrioArchivo();
            leer_archivo.close();
            

        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir el archivo" + e);

        }
        System.out.println(data);
        return data;

    }
}