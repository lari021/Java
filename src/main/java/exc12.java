public class SomaNumeros {

    public static void main(String[] args) {
        int soma = 0;

        // Somar os números de 1 a 15
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }

        // Exibir resultado
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}