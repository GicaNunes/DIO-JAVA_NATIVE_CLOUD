package iphoneUML;

public class Teste {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando funcionalidades
        meuIPhone.tocar();
        meuIPhone.selecionarMusica("Iniko - Jericho");
        meuIPhone.pausar();

        meuIPhone.ligar("799999-8888");
        meuIPhone.atender();

        meuIPhone.exibirPagina("https://gicanunes.github.io/Curriculo_Web/");
        meuIPhone.adicionarNovaAba();
    }
}
