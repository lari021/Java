import java.util.Scanner;

public class SomaSequencia2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite uma sequência de números (termine com um número negativo):");

        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        scanner.close();

        System.out.println("A soma dos números é: " + soma);
    }
}
