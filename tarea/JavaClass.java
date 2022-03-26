/**
 * JavaClass
 */
public class JavaClass {

    public static void main(String[] args) {
        System.out.println("Jonathan Ubaldo Mateo Jacinto");
        Suma            suma            = new Suma          (10, 2);
        Resta           resta           = new Resta         (10, 2);
        Multiplicacion  multiplicacion  = new Multiplicacion(10, 2);
        Division        division        = new Division      (10, 2);

        System.out.println("la suma es: "           + suma.Operar());
        System.out.println("la resta es: "          + resta.Operar());
        System.out.println("la multipliacion es: "  + multiplicacion.Operar());
        System.out.println("la division es: "       + division.Operar());
        
    }
}