import java.util.Scanner;

public class EXEC9ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();
        double imposto = 0.0;

        if (salario > 4500.00) {
            imposto += (salario - 4500.00) * 0.28;
            salario = 4500.00;
        }
        if (salario > 3000.00) {
            imposto += (salario - 3000.00) * 0.18;
            salario = 3000.00;
        }
        if (salario > 2000.00) {
            imposto += (salario - 2000.00) * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        }

        scanner.close();
    }
}
