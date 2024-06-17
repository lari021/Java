import java.util.Scanner;

public class CreditoEspecialCEF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo médio no último ano:");
        double saldoMedio = scanner.nextDouble();

        scanner.close();

        // Calcular crédito com juros de 2%
        double credito = saldoMedio * 0.02;

        // Exibir resultado
        System.out.println("Saldo médio: R$" + saldoMedio);
        System.out.println("Valor de crédito especial: R$" + credito);
    }
}