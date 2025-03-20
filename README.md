# DIO-UML_IPHONE

```mermaid

classDiagram
  class ReprodutorMusical {
    void tocar()
    void pausar()
    void selecionarMusica(String musica)
  }

  class AparelhoTelefonico {
    void ligar(String numero)
    void atender()
    void iniciarCorreioVoz()  
  }  

  class NavegadorInternet {
    void exibirPagina(String url)
    void adicionarNovaAba()
    void atualizarPagina()
  }

  class iPhone {
    String numero;
    String modelo;
    String cor;

    funcoes das interfaces()
  }
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
