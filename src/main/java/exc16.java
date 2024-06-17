import java.util.Scanner;

public class MediaIdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite as idades de 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            int idade = scanner.nextInt();
            soma += idade;
        }

        scanner.close();

        double media = soma / 20.0;

        System.out.println("A média das idades é: " + media);
    }
}