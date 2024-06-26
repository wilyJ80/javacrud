# javacrud basico

Diagram made with Mermaid Maven plugin

```mermaid
classDiagram
  class Alimento {
<<abstract>>
    - codigo : String
    - nomeDoAlimento : String
    - preco : double
    - quantidadeDoProduto : int
    + Alimento(nomeDoAlimento : String, preco : double, quantidadeDoProduto : int, codigo : String)
    + alterarAtributosEspecificos(Scanner)* 
    + calcularImposto() : double
    + getCodigo() : String
    + getNomeDoAlimento() : String
    + getPreco() : double
    + getQuantidadeDoProduto() : int
    + getTipo() : String
    + setCodigo(codigo : String)
    + setNomeDoAlimento(nomeDoAlimento : String)
    + setPreco(preco : double)
    + setQuantidadeDoProduto(quantidadeDoProduto : int)
    + toString() : String
  }
  class Bebida {

    - teorAlcoolico : double
    + Bebida(nomeDoAlimento : String, preco : double, quantidadeDoProduto : int, codigo : String, teorAlcoolico : double)
    + alterarAtributosEspecificos(scanner : Scanner)
    + calcularImposto() : double
    + getTeorAlcoolico() : double
    + getTipo() : String
    + setTeorAlcoolico(teorAlcoolico : double)
    + toString() : String
  }
  class ConsoleUI {

    + ConsoleUI()
    + iniciar()
  }
  class Principal {

    + Principal()
    + main(args : String[])$ 
  }
  class Restaurante {

    - listaDeAlimentos : ArrayList<Alimento>
    + Restaurante()
    + adicionarAlimento(novoAlimento : Alimento)
    + alterarDadosAlimento(nomeDoAlimento : String, codigo : String, scanner : Scanner)
    + consultarAlimento(nomeDoAlimento : String, codigo : String) : Alimento
    + excluirAlimento(nomeDoAlimento : String, codigo : String)
    + listarAlimentos()
  }
  class Sobremesa {

    - teorDeAcucar : double
    + Sobremesa(nomeDoAlimento : String, preco : double, quantidadeDoProduto : int, codigo : String, teorDeAcucar : double)
    + alterarAtributosEspecificos(scanner : Scanner)
    + calcularImposto() : double
    + getTeorDeAcucar() : double
    + getTipo() : String
    + setTeorDeAcucar(teorDeAcucar : double)
    + toString() : String
  }
  class Solido {

    - porcao : double
    - temperatura : double
    + Solido(nomeDoAlimento : String, preco : double, quantidadeDoProduto : int, codigo : String, porcao : double, temperatura : double)
    + alterarAtributosEspecificos(scanner : Scanner)
    + calcularImposto() : double
    + getPorcao() : double
    + getTemperatura() : double
    + getTipo() : String
    + setPorcao(porcao : double)
    + setTemperatura(temperatura : double)
    + toString() : String
  }
  class TipoDeAlimento {
<<interface>>
    + calcularImposto() : double* 
    + getTipo() : String* 
  }
Restaurante -->  "-listaDeAlimentos" Alimento
Alimento ..|> TipoDeAlimento
Bebida --|> Alimento
Sobremesa --|> Alimento
Solido --|> Alimento
```

# Parte 1: OK
### Criação de um menu para escolha das funções por parte do usuário, conforme o exemplo abaixo. (Exemplo de uma interface com o usuário no Console).
- Incluir novo “produto”
- Consultar um “produto”
    - [X] Alimento não encontrado está dando erro
- Alterar dados de um “produto”
    - [X] Deve funcionar para todos os atributos
    - [X] Está trazendo mensagem repetida
- Excluir dados de um “produto”
- Imprimir em tela lista de “produtos”.
- Na inclusão de um novo “produto”, o sistema deve permitir a inclusão de um registro por vez. A inclusão dos registros não deve desenvolvida como um laço de repetição contínuo, mas sim conforme a escolha da função “Incluir” por parte do usuário. O mesmo raciocínio se aplica para as funções de alterar e excluir.
- O cenário escolhido pela equipe deve contemplar uma modelagem de no mínimo 4 classes. 

# Parte 2:
- [X] Uso funcional de Herança no sistema e na modelagem de classes. (Nota Máxima = 8,0)

# Parte 3:
- [X] Uso funcional de Polimorfismo no sistema e na modelagem de classes. (Nota Máxima = 9,0)
- [X]  Precisa adicionar mais um metodo polimorfico, esta pouco
      
### Tema: Restaurante
### Ideias de atributos especificos:
- Bebida:
  - Teor Alcoolico
- Solido:
  - Porcao
  - Temperatura
- Sobremesa:
  - Teor de Acucar

# Parte final:
- [ ] Uso de interface gráfica (Nota Máxima = 10,0)

# Logica:
- [X] Validacoes: produto ja cadastrado: deseja incrementar quantidade?
