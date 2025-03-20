public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String numero;
    private String modelo;
    private String cor;

    public Iphone(String numero, String modelo, String cor) {
        this.numero = numero;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta no navegador.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
