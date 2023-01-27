package App_main;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;


public class Escribir {

    public void Escritura(String Nombre_archivo, String arreglo){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        try{
            f= new File(Nombre_archivo);
            w= new FileWriter(f,true); //true para escribir al final
            bw= new BufferedWriter(w);
            wr= new PrintWriter(bw);
            //wr.write("xd");
            wr.append(arreglo+"\r\n");
            wr.close();


        }catch (Exception e){
            System.out.println("Excepcion" +e);

        }
        //BufferedReader br = new BufferedReaderer;
}
    
}
