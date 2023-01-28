package App_main;

import App_main.model.Calculadora;

public class MostrarMenu {
        Vista vista;
        Controller controlador;
        int opcion=0;
        Calculadora calculadora;
        String expresion;
        

    public MostrarMenu(){
        vista = new Vista();
        controlador= new Controller();
    }
    public void MostrarPrograma(){
        vista.Mensaje(); 
        
        

        while (opcion!=4){
            opcion= vista.SeleccioneMenu("\nBienvenido a su calculadora\nAntes de realizar la operación deseada asegurese que la expresión en el archivo este bien escrita\n\nIngrese una opción:\n1.Leer el archivo  \n2.Ingresar una expresión \n3.Calcular  \n4. salir");
/////////////1. Leer el archivo//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opcion==1){
                controlador.leerArchivo();
            }
/////////////2. Escribir en el archivo //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try{
                if (opcion==2){
                    expresion= vista.SeleccioneMenuString("ingrese la expresión: (ej: 656*-)");
                    controlador.EscribirArchivo(expresion);
                    
                }
    ///////////3. ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==3){
                    calculadora.evaluate(expresion);

                }
            /////salir//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }catch (Exception e){
                vista.validacion();
            }
        }

  
    }

}
