public class Division extends Operacion{
    
    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public double Operar(){
        return a/b;
    }
}
