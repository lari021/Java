import java.util.Scanner;

public class PrestacoesCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        scanner.close();

        double valorPrestacao = valorCompra / 5;

        System.out.println("Valor de cada prestação (em 5x sem juros): R$" + valorPrestacao);
    }
}