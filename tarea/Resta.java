public class Resta extends Operacion{
    
    
    public Resta(double a, double b) {
        super(a, b);
    }

    @Override
    public double Operar(){
        return a-b;
    }
}
