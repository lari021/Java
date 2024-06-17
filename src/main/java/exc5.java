import java.util.Scanner;

public class ClassificacaoEleitoral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        scanner.close();

        // Classificação eleitoral
        if (idade < 16) {
            System.out.println("Não eleitor.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatório.");
        } else {
            System.out.println("Eleitor facultativo.");
        }
    }
}