import java.util.Scanner;

public class EXEC5ValorTotalMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        double precoPorUnidade;

        if (quantidade < 12) {
            precoPorUnidade = 0.50;
        } else {
            precoPorUnidade = 0.40;
        }

        double total = quantidade * precoPorUnidade;
        System.out.printf("Valor total da compra: R$ %.2f%n", total);

        scanner.close();
    }
}
