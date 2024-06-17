import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Celsius
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        scanner.close();

        // Conversão para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;

        // Exibir resultado
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}