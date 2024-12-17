import java.util.Scanner;

public class EXEC7ValorConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do item: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double preco;

        if (codigo == 1) {
            preco = 4.00; // Hot Dog
        } else if (codigo == 2) {
            preco = 4.50; // X-Salada
        } else if (codigo == 3) {
            preco = 5.00; // X-Bacon
        } else if (codigo == 4) {
            preco = 2.00; // Torrada
        } else if (codigo == 5) {
            preco = 1.50; // Refrigerante
        } else {
            preco = 0.00; // Código inválido
            System.out.println("Código inválido!");
        }

        double total = quantidade * preco;
        if (preco != 0) {
            System.out.printf("Valor total da conta: R$ %.2f%n", total);
        }

        scanner.close();
    }
}
