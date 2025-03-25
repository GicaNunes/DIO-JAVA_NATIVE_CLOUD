package desafiosDeCodigo;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo do cliente
        double saldo = scanner.nextDouble();

        // Classificação do cliente com base no saldo
        if (saldo < 0) {
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500) {
            System.out.println("Baixo");
        } else {
            System.out.println("Confortavel");
        }

        scanner.close();
    }
}
