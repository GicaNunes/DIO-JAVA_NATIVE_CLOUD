package desafioProcessoSeletivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       
        String[] candidatos = {"Maria", "José", "Ana", "Carlos", "Fernanda", "Lucas",
                               "Roberta", "Paulo", "Amanda", "Tiago", "Juliana", "João"};

        // Inicializa as variáveis
        int candidatosSelecionados = 0; // Quantidade de candidatos selecionados
        int candidatosAtual = 0; // Índice para o candidato atual
        double salarioBase = 2000.00; // Salário base definido

        // Lista para armazenar os candidatos selecionados
        List<String> listaSelecionados = new ArrayList<>();

        // Executa o processo de seleção
        try {
            while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
                // Simula o salário pretendido do candidato atual
                double salarioPretendido = simularSalarioPretendido();

                // Exibe informações do candidato atual
                System.out.println("Analisando " + candidatos[candidatosAtual] + " com salário pretendido: R$ " + salarioPretendido);

                // Avalia se o candidato atende aos critérios de seleção
                if (salarioPretendido <= salarioBase) {
                    System.out.println("Candidato selecionado: " + candidatos[candidatosAtual]);
                    listaSelecionados.add(candidatos[candidatosAtual]); // Adiciona à lista de selecionados
                    candidatosSelecionados++; // Incrementa o número de candidatos selecionados
                } else {
                    System.out.println("Candidato não selecionado: " + candidatos[candidatosAtual]);
                }

                candidatosAtual++; // Passa para o próximo candidato
            }

            System.out.println("\nSeleção finalizada. Total de candidatos selecionados: " + candidatosSelecionados);
            
            // Imprime a lista dos candidatos selecionados
            System.out.println("\nCandidatos selecionados para o RH entrar em contato:");
            for (String candidato : listaSelecionados) {
                System.out.println(candidato);
            }

            // Inicia tentativas de contato com os candidatos selecionados
            System.out.println("\nTentativas de contato com os candidatos selecionados:");
            realizarContato(listaSelecionados);

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }

    // Método para simular o salário pretendido
    public static double simularSalarioPretendido() {
        double salarioMinimo = 1800.00; // Faixa mínima do salário pretendido
        double salarioMaximo = 2200.00; // Faixa máxima do salário pretendido

        try {
            // Gera um valor aleatório usando ThreadLocalRandom
            return ThreadLocalRandom.current().nextDouble(salarioMinimo, salarioMaximo);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: Parâmetros inválidos para geração de número aleatório. Detalhes: " + e.getMessage());
            return salarioMinimo; // Retorna o valor mínimo em caso de erro
        }
    }

    // Método para realizar tentativas de contato com os candidatos usando while
    public static void realizarContato(List<String> candidatos) {
        Random random = new Random();

        for (String candidato : candidatos) {
            boolean contatoConseguido = false;
            int tentativa = 1;

            while (!contatoConseguido && tentativa <= 3) {
                int resposta = random.nextInt(3); // Gera um número aleatório de 0 a 2

                if (resposta == 0) { // Sucesso no contato quando o número gerado for 0
                    contatoConseguido = true;
                    System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativa + ".");
                } else {
                    tentativa++; // Incrementa a tentativa
                }
            }

            if (!contatoConseguido) {
                System.out.println("Não conseguimos contato com " + candidato + ".");
            }
        }
    }
}
