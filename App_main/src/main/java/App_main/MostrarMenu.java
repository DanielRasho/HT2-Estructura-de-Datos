package App_main;

public class MostrarMenu {
        Vista vista;
        Controller controlador;
        int opcion=0;
        

    public MostrarMenu(){
        vista = new Vista();
        controlador= new Controller();
    }
    public void MostrarPrograma(){
        vista.Mensaje(); 
        
        

        while (opcion!=8){
            opcion= vista.SeleccioneMenu("\nBienvenido a su calculadora\nAntes de realizar la operación deseada asegurese que la expresión en el archivo este bien escrita\n\nIngrese una opción:\n1.Leer el archivo  \n2. Ingresar una expresión \n3.  \n4.  \n5. \n6. \n7. \n8. salir");
/////////////1. Leer el archivo//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (opcion==1){
                controlador.leerArchivo();
            }
/////////////2. Escribir en el archivo //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try{
                if (opcion==2){
                    String expresion= vista.SeleccioneMenuString("ingrese la expresión: (ej: 656*-)");
                    controlador.EscribirArchivo(expresion);
                    
                }
    ///////////3. ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==3){
                    

                }
    /////////////4.  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==4){
                    
                    
                }
    //////////////5. ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==5){
                    
                }
    //////////////6. /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                else if (opcion==6){
                    
                }
    /////////////7.  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                else if (opcion==7){
                    

                }
            /////salir//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }catch (Exception e){
                vista.validacion2();
            }
        }

  
    }

}
