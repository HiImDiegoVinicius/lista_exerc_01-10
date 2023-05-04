import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperatura em Celsius: ");
        double Celsius = input.nextDouble();
        double converterF = (Celsius * 1.8) + 32;
        input.close();
        System.out.println("Temperatura em Fahrenheit: " + converterF);
    }
}
