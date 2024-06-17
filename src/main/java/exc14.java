import java.util.Scanner;

public class SomaDezNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }

        scanner.close();

        System.out.println("A soma dos 10 números é: " + soma);
    }
}