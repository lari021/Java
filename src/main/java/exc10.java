import java.util.Scanner;

public class ReajusteSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do saldo
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        // Cálculo do saldo com reajuste de 1.5%
        double saldoReajustado = saldo * 1.015;

        // Exibir resultado
        System.out.println("Saldo com reajuste: R$" + saldoReajustado);
    }
}