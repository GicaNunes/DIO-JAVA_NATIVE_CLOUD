package desafiosDeCodigo;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Entrada do saldo inicial
     double saldoInicial = scanner.nextDouble();

     // Entrada das três transações
     double transacao1 = scanner.nextDouble();
     double transacao2 = scanner.nextDouble();
     double transacao3 = scanner.nextDouble();

     // Cálculo do saldo final
     double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

     // Exibição do saldo final
     System.out.printf("%.2f\n", saldoFinal);

     scanner.close();
 }
}
