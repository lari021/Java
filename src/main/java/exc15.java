import java.util.Scanner;

public class SomaIdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite as idades de 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            int idade = scanner.nextInt();
            soma += idade;
        }

        scanner.close();

        System.out.println("A soma das idades é: " + soma);
    }
}
