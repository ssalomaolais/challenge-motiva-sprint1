# Challenge Motiva - Sprint 1: O Dominio Base
 
## Descricao do Projeto
O objetivo macro deste projeto e construir um sistema de monitoramento e priorizacao de rocada de vegetacao nas rodovias da Motiva/CCR. Esta primeira Sprint foca na modelagem do dominio base, utilizando conceitos de Programacao Orientada a Objetos (POO) em Java para construir um prototipo em console.
 
O sistema simula a operacao real: instancia trechos de rodovia, registra niveis simulados de crescimento da vegetacao e associa equipes de manutencao aos locais mais criticos.
 
---
 
## Estrutura do Codigo
O repositorio esta estruturado da seguinte forma para garantir as praticas de Clean Code e a correta separacao de responsabilidades:
 
* **`src/TrechoRodovia.java`**: Classe de dominio principal. Aplica encapsulamento para garantir a integridade dos dados da vegetacao e define os metodos comportamentais (como o registro de crescimento).
* **`src/EquipeManutencao.java`**: Classe responsavel por representar e gerenciar as equipes de rocada, permitindo aloca-las aos trechos da rodovia.
* **`src/Main.java`**: Arquivo de execucao principal. Contem o metodo `main` que simula o funcionamento do sistema operando via terminal.
* **`test/TrechoRodoviaTest.java`**: Arquivo destinado aos testes unitarios (utilizando o padrao da biblioteca JUnit) para validar a instanciacao, as regras matematicas de crescimento da vegetacao e a protecao do encapsulamento.
 
---
 
## Respostas de Reflexao (POO)
 
**1. Por que TrechoRodovia e uma classe e "BR-116 KM 10 ao 15" e um objeto?**
A classe `TrechoRodovia` atua como um molde abstrato (ou planta-baixa) que define quais atributos e quais comportamentos padroes qualquer trecho de rodovia no sistema devera ter. Ja "BR-116 KM 10 ao 15" e o objeto: uma instancia concreta gerada a partir desse molde. O objeto contem dados e informacoes reais, possui um estado especifico e ocupa espaco fisico na memoria do computador durante a execucao do programa.
 
**2. Como um metodo difere de uma funcao solta em programacao estruturada?**
Em programacao estruturada, uma funcao solta e apenas um bloco de instrucoes global que recebe dados, os processa e retorna um resultado, sem pertencer a nenhuma entidade especifica do sistema. Na Orientacao a Objetos, um metodo pertence exclusivamente a uma classe e atua diretamente sobre o estado (os atributos privados) do objeto instanciado. O metodo e uma acao propria do objeto para alterar ou gerenciar a si mesmo, mantendo a coesao estrutural.
 
**3. Se o nivelVegetacao fosse publico, que tipo de "quebra" no sistema de previsao da Motiva um programador descuidado poderia causar?**
Se a variavel fosse publica, as regras de negocio definidas pela Motiva seriam ignoradas e o encapsulamento seria quebrado. Um programador poderia atribuir livremente um valor direto, como `trecho.nivelVegetacao = -50.0`, violando a logica do mundo real (uma vez que a altura de uma planta nao pode ser negativa). No contexto da operacao rodoviaria, isso corromperia os calculos de media de crescimento do sistema, baguncaria o painel de monitoramento e impediria a alocacao correta das equipes de manutencao para as areas perigosas, gerando riscos de seguranca graves na via e ineficiencia operacional para a concessionaria.
