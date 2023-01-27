package App_main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {

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
            leer_archivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir el archivo" + e);

        }
    }
}