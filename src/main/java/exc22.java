import java.util.Scanner;

public class NumerosEntreZeroCem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entreZeroCem = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                entreZeroCem++;
            }
        }

        scanner.close();

        System.out.println("Quantidade de números entre 0 e 100: " + entreZeroCem);
    }
}