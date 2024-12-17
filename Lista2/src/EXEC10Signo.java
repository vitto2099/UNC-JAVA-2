import java.util.Scanner;

public class EXEC10Signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mes = scanner.nextInt();

        String signo;

        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            signo = "Áries";
        } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            signo = "Touro";
        } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            signo = "Gêmeos";
        } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            signo = "Câncer";
        } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            signo = "Leão";
        } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            signo = "Virgem";
        } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            signo = "Libra";
        } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            signo = "Escorpião";
        } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            signo = "Sagitário";
        } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            signo = "Capricórnio";
        } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            signo = "Aquário";
        } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            signo = "Peixes";
        } else {
            signo = "Data inválida";
        }

        System.out.println("Seu signo é: " + signo);

        scanner.close();
    }
}
