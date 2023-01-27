package App_main.model;

public class Calculadora implements ICalculator {

    @Override
    public double evaluate(String expression) throws ArithmeticException {
        StackedArray<Character> StackC  = new StackedArray<>();

        int o= 0;
        int a= 0;
        int b=0;
        int r=0;

        String operacion = "12=4*3";
        char caracter;

        for(int n=0; n < operacion.length(); n++){
            caracter = operacion.charAt(n);

            if (caracter>='0' && caracter <='9'){
                StackC.push(caracter);
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
