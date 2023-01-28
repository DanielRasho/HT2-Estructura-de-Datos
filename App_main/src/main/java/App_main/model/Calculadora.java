package App_main.model;

public class Calculadora implements ICalculator {
    public Calculadora(){

    }
    public void evaluate2Prueba(){
        System.out.println("Bandera 0 ");

    }
    
    @Override
    public double evaluate(String expression) throws ArithmeticException {
        System.out.println("Bandera 0 ");
        StackedArray<Character> StackC  = new StackedArray<>();
        System.out.println("Bandera 1 ");
        int o= 0;
        int a= 0;
        int b=0;
        int r=0;

        String operacion = expression; 
        char caracter;

        System.out.println("expresion "+operacion);


        for(int n=0; n < operacion.length(); n++){

            caracter = operacion.charAt(n);
            System.out.println("caracter "+caracter);


            /*if (caracter!= ' '){
                
            }*/
            if (caracter>='0' && caracter <='9'){
                StackC.push(caracter);
                System.out.println("caracter "+caracter);
                System.out.println("stack "+caracter);


            }
            else{
                b = StackC.pop();
                a = StackC.pop();

                if (caracter =='+'){
                    r = a+b;
                    StackC.push((char) r);
                }
                if (caracter =='-'){
                    r = a-b;
                    StackC.push((char) r);
                }
                if (caracter =='*'){
                    r = a*b;
                    StackC.push((char) r);
                }
                if (caracter =='/'){
                    r = a/b;
                    StackC.push((char) r);
                }
            }
        }
        return r;
    }

    @Override
    public double getPrevious() {
        return 0;
    }
}
