import java.util.Scanner;

public class EXEC8IntervaloValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("O valor está no intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("O valor está no intervalo [25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("O valor está no intervalo [50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("O valor está no intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        scanner.close();
    }
}
