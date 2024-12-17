import java.util.Scanner;

public class EXEC1RegiaoProcedencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;

        System.out.print("Digite o código de origem do produto: ");
        codigo = scanner.nextInt();

        if (codigo == 1) {
            System.out.println("Região de procedência: Sul");
        } else if (codigo == 2) {
            System.out.println("Região de procedência: Norte");
        } else if (codigo == 3) {
            System.out.println("Região de procedência: Leste");
        } else if (codigo == 4) {
            System.out.println("Região de procedência: Oeste");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Região de procedência: Nordeste");
        } else if (codigo == 7 || codigo == 8 || codigo == 9) {
            System.out.println("Região de procedência: Sudeste");
        } else if (codigo == 10) {
            System.out.println("Região de procedência: Centro-Oeste");
        } else if (codigo == 11) {
            System.out.println("Região de procedência: Noroeste");
        } else {
            System.out.println("Produto importado");
        }

        scanner.close();
    }
}
