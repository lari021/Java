import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        scanner.close();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Número: " + numero);
        System.out.println("Sucessor: " + sucessor);
    }
}