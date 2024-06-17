import java.util.Scanner;

public class MaioresIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maioresDeIdade = 0;

        System.out.println("Digite as idades de 20 pessoas:");

        for (int i = 0; i < 20; i++) {
            int idade = scanner.nextInt();
            if (idade >= 18) {
                maioresDeIdade++;
            }
        }

        scanner.close();

        System.out.println("Número de pessoas maiores de idade: " + maioresDeIdade);
    }
}