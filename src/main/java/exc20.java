import java.util.Scanner;

public class NumerosMaioresOito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maioresQueOito = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero > 8) {
                maioresQueOito++;
            }
        }

        scanner.close();

        System.out.println("Quantidade de números maiores que 8: " + maioresQueOito);
    }
}