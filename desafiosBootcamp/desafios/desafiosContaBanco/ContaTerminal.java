package desafiosContaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha11

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();

            String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
            System.out.println(mensagem);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, verifique os dados inseridos e tente novamente.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
