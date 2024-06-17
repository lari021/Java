import java.util.Scanner;

public class ValoresDescendente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três valores inteiros:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        scanner.close();

        // Ordenação dos valores
        if (A >= B && A >= C) {
            if (B >= C) {
                System.out.println(A + ", " + B + ", " + C);
            } else {
                System.out.println(A + ", " + C + ", " + B);
            }
        } else if (B >= A && B >= C) {
            if (A >= C) {
                System.out.println(B + ", " + A + ", " + C);
            } else {
                System.out.println(B + ", " + C + ", " + A);
            }
        } else {
            if (A >= B) {
                System.out.println(C + ", " + A + ", " + B);
            } else {
                System.out.println(C + ", " + B + ", " + A);
            }
        }
    }
}