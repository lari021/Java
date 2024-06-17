import java.util.Scanner;

public class CalculoValorTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da porcentagem do IPI
        System.out.println("Digite a porcentagem do IPI:");
        double ipi = scanner.nextDouble();

        // Leitura dos dados da peça 1
        System.out.println("Digite o código da peça 1:");
        int codigo1 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 1:");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 1:");
        int quantidade1 = scanner.nextInt();

        // Leitura dos dados da peça 2
        System.out.println("Digite o código da peça 2:");
        int codigo2 = scanner.nextInt();
        System.out.println("Digite o valor unitário da peça 2:");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite a quantidade de peças 2:");
        int quantidade2 = scanner.nextInt();

        scanner.close();

        // Cálculo do valor total a ser pago
        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        // Exibir resultado
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}