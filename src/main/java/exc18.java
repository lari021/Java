import java.util.Scanner;

public class PessoaMaisNova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        System.out.println("Digite o nome e a idade de 10 pessoas:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome:");
            String nome = scanner.next();
            System.out.println("Idade:");
            int idade = scanner.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        scanner.close();

        System.out.println("A pessoa mais nova é: " + nomeMaisNova);
    }
}
