public class Multiplicacion extends Operacion {
    
    public Multiplicacion(double a, double b) {
        super(a, b);
    }

    @Override
    public double Operar(){
        return a*b;
    }
}
