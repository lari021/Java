import java.util.Scanner;

public class SalarioVendedor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do vendedor
        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();
        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();
        System.out.println("Digite o total de vendas do vendedor:");
        double totalVendas = scanner.nextDouble();

        scanner.close();

        // Cálculo da comissão (15% sobre as vendas)
        double comissao = totalVendas * 0.15;

        // Cálculo do salário total
        double salarioTotal = salarioFixo + comissao;

        // Exibir resultados
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Salário total no final do mês: R$" + salarioTotal);
    }
}