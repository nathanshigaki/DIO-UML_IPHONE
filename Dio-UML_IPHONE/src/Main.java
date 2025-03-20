public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("+xx (xx)9xxxx-xxxx", "Primeiro modelo", "Branco");
        
        // Testando funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();
        
        iphone.ligar("+551199999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina("www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
