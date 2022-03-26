public class Suma extends Operacion {

    public Suma(double a, double b) {
        super(a, b);
    }

    @Override
    public double Operar(){
        return a+b;
    }
    
}
