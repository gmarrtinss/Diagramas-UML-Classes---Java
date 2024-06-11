public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testes
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Teste das funcionalidades do reprodutor musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Ew - Joji ");

        // Teste das funcionalidades do aparelho telefônico
        meuIPhone.ligar(" 4002-8922‍");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Teste das funcionalidades do navegador na internet
        meuIPhone.exibirPagina(" https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
