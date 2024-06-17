import java.util.Scanner;

public class ConversaoDolarReal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares:");
        double quantidadeDolares = scanner.nextDouble();

        scanner.close();

        double valorReais = cotacaoDolar * quantidadeDolares;

        System.out.println("Valor em reais: R$" + valorReais);
    }
}