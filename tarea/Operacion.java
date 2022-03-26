public abstract class Operacion {
    protected  double a;
    protected double b;
    private double total;

    public Operacion(double a, double b){
        this.a=a;
        this.b=b;
    }

    public abstract double Operar();
    
}
