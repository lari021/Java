import java.util.Scanner;

public class ClassificarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entreZeroCem = 0;
        int entreCemDuzentos = 0;
        int maioresDuzentos = 0;

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                entreZeroCem++;
            } else if (numero >= 101 && numero <= 200) {
                entreCemDuzentos++;
            } else if (numero > 200) {
                maioresDuzentos++;
            }
        }

        scanner.close();

        System.out.println("Quantidade de números entre 0 e 100: " + entreZeroCem);
        System.out.println("Quantidade de números entre 101 e 200: " + entreCemDuzentos);
        System.out.println("Quantidade de números maiores que 200: " + maioresDuzentos);
    }
}