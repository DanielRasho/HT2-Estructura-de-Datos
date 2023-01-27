package App_main.model;

public class Calculadora {
        StackedArray<String> StackC  = new StackedArray<>();

        int o= 0; 
        int a= 0;
        int b=0;
        int r=0;
        
        String operacion = "12=4*3";
        char caracter = '';
        
         for(n=0; n < operacion.length(); n++){
             caracter = operacion;
             
             if (caracter>='0' && caracter <='9'){
             }
             else{
                 b= StackC.pop();
                 a= StackC.pop();
                 if (caracter =='+'){
                     r = a+b;
                 }
                 if (caracter =='-'){
                     r = a-b;
                     StackC.push(r);
                 }
                 if (caracter =='*'){
                     r = a*b;
                     StackC.push(r);
                 }
                 if (caracter =='/'){
                     r = a/b;
                     StackC.push(r);
                 }
             }
         }
        return StackC;
    }
}


