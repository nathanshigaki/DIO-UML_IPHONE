# DIO-UML_IPHONE

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

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
