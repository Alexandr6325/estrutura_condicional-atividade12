import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double N = sc.nextDouble();

        if (N < 0.00 || N > 100){
            System.out.println("FORA DE INTERVALO");
        }else if (N < 25){
            System.out.println("Intervalo [0,25]");
        }else if (N < 50){
            System.out.println("Intervalo [25,50]");
        }else if (N < 75){
            System.out.println("Intervalo [50,75]");
        }else {
            System.out.println("Intervalo [75,100]");
        }
    
        sc.close();
    }
}
