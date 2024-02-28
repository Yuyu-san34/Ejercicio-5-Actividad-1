import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double radio,area,circunferencia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese radio:");
        radio = entrada.nextFloat();
        area=2*radio*Math.PI;
        circunferencia=radio*radio*Math.PI;
        System.out.println("El area del circulo es :"+area);
        System.out.println("La circunferencia del circulo es:"+circunferencia);
        entrada.close()


    }
}
