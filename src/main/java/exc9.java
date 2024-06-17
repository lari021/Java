import java.util.Scanner;

public class SalariosMinimos {

    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1212.00; // Salário mínimo atual

        Scanner scanner = new Scanner(System.in);

        // Leitura do salário do usuário
        System.out.println("Digite o salário do usuário:");
        double salarioUsuario = scanner.nextDouble();

        scanner.close();

        // Cálculo de quantos salários mínimos o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / SALARIO_MINIMO;

        // Exibir resultado
        System.out.println("O usuário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
