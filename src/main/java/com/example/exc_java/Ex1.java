import java.util.Scanner;

public class CalculadoraCalorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        System.out.println("Escolha seu prato:");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        int prato = scanner.nextInt();

        System.out.println("Escolha sua sobremesa:");
        System.out.println("1 - Abacaxi");
        System.out.println("2 - Sorvete diet");
        System.out.println("3 - Mousse diet");
        System.out.println("4 - Mousse chocolate");
        int sobremesa = scanner.nextInt();

        System.out.println("Escolha sua bebida:");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        int bebida = scanner.nextInt();

        scanner.close();

        // Calorias por opção escolhida
        int caloriasPrato = calcularCaloriasPrato(prato);
        int caloriasSobremesa = calcularCaloriasSobremesa(sobremesa);
        int caloriasBebida = calcularCaloriasBebida(bebida);

        // Calcular total de calorias
        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        // Exibir resultado
        System.out.println("Total de calorias da refeição: " + totalCalorias);
    }

    // Métodos auxiliares para calcular calorias de cada opção
    public static int calcularCaloriasPrato(int opcao) {
        switch (opcao) {
            case 1:
                return 300; // Calorias do vegetariano
            case 2:
                return 350; // Calorias do peixe
            case 3:
                return 400; // Calorias do frango
            case 4:
                return 450; // Calorias da carne
            default:
                return 0; // Opção inválida
        }
    }

    public static int calcularCaloriasSobremesa(int opcao) {
        switch (opcao) {
            case 1:
                return 100; // Calorias do abacaxi
            case 2:
                return 150; // Calorias do sorvete diet
            case 3:
                return 200; // Calorias do mousse diet
            case 4:
                return 250; // Calorias do mousse chocolate
            default:
                return 0; // Opção inválida
        }
    }

    public static int calcularCaloriasBebida(int opcao) {
        switch (opcao) {
            case 1:
                return 50; // Calorias do chá
            case 2:
                return 80; // Calorias do suco de laranja
            case 3:
                return 90; // Calorias do suco de melão
            case 4:
                return 70; // Calorias do refrigerante diet
            default:
                return 0; // Opção inválida
        }
    }
}
}