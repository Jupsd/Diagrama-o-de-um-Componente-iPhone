// Interface ReprodutorMusical.java
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface AparelhoTelefonico.java
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface NavegadorInternet.java
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone.java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        // Implementação
    }

    @Override
    public void pausar() {
        // Implementação
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação
    }

    @Override
    public void ligar(String numero) {
        // Implementação
    }

    @Override
    public void atender() {
        // Implementação
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação
    }

    @Override
    public void atualizarPagina() {
        // Implementação
    }
}
