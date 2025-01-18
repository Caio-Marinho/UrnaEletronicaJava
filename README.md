# Urna Eletronica Java
Este projeto consiste em uma simulação de urna eletrônica simplificada, desenvolvida em Java. O programa permite que os usuários votem em cinco candidatos fictícios inspirados em figuras da ciência e da música. A aplicação valida os votos, contabiliza os resultados e exibe informações detalhadas sobre a votação, incluindo o número de votos por candidato, percentuais, votos nulos e o vencedor da eleição.

## Funcionalidades
- Candidatos pré-configurados com nomes e números.
- Entrada de até 10 votos ou seja é o dobro da quantidade de candidatos, com validação para garantir que apenas votos válidos sejam contabilizados.
- Apuração dos resultados e exibição clara dos dados da votação.
- Interação com o usuário via console.

### Arquivo Candidato.java

#### Classe
- `Candidato`: Representa um candidato com nome e número de voto.

#### Atributos
- `_nome`: Nome do candidato - privado.
- `_numero`: Número de voto do candidato - privado.
- `_voto` : Numero de votos que um determinado candidado recebeu - privado.

#### Métodos/Funções
- `Candidato(String nome, int numero)`: Construtor para criar um candidato.
- `String getNome()`: Retorna o nome do candidato.
- `int getNumero()`: Retorna o número do candidato.
- `int getVoto()`: Retorna o número de votos que um determinado candidato recebeu.


### Arquivo UrnaEletronicaJava.java

#### Classe
- `UrnaEletronicaJava`: Reprensenta uma Urna Eletronica que irá receber os votos.

#### Atributos
- `_candidatos`: Vetor de candidatos - privado.
- `_votosNulos`: votos nulos - privado.

#### Métodos/Funções
- `UrnaEletronicaJava()`: Construtor para criar uma Urna Eletronica.
- `void inicializarCandidato(Candidato candidato)`: Adiciona um candidato.
- `ArrayList <Candidato> getCandidato()`: Retorna um ArrayList dos candidatos
- `int receberVoto(int numero)`: Vota em um candidato.
- `int votantes()`: Calcula o número de votantes, sendo sempre o dobro da quantidade de candidatos.

### Arquivo Main.java

- `Main`: Método que irá Exercutar o Programa.

### Menu.java

- `Menu(ArrayList<Candidato> candidato)`: Método para Lista os candidatos.

### ValidadorDeVotos.java

- `validarVotos(String voto)`: Método para Validar a entrada de dados.

### Resuldados.java

- `void apurarResultados(ArrayList<Candidato> candidato,int votantes,int votosNulos)`: Apura os votos.
- `void exibirResultados(ArrayList<Candidato> candidato)`: Exibe os resultados da votação.
- `double totaisVotosValidos(int votantes, int votosNulos)`: Calcula os votos validos de acordo com os Votos Nulos.
- `double porcentagemVotosValidos(double votos,int votantes,int votosNulos)`: Calcula a porcentagem de votos do candidato em relação aos votos válidos.

## Instalação

Windows:
<br>
- [Instale o java JDK versão 21.0.5](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Baixe o Apacche Maven versão 3.9.9 - Binary zip archive](https://maven.apache.org/download.cgi)

Para Visualização do Projeto, primeiro clone ele em seu ambiente de desenvolvimento local.

```bash
git clone https://github.com/Caio-Marinho/UrnaEletronicaJava.git
```
## Dependências

Na sua maquina nas variaveis de ambiente adicione no path, o arquivo `bin` do Jdk e do Maven

Em seguida abra o seu Visual Studio Code(VS code) e baixe as extensões

- `Language Support for Java(TM) by Red Hat`
- `Grandle for Java`
- `Debugger for Java`
- `Java Extension Pack`
- `Java Test Runner`
- `Maven for Java`

## Execução

No VS Code, dentro da pasta do repositório, execute os seguintes comandos no terminal:

```bash
javac Main.java
```
E

```bash
java Main
```
OU:

```bash
javac Main.java & java Main
```
Alternativamente, navegue para dentro da pasta onde estão os seguintes arquivos:

- `Candidato.java`
- `UrnaEletronicaJava.java`
- `README.md`
- `LICENSE`

Dentro da pasta, digite na barra de endereço:

```bash
cmd
```
No CMD, digite:

```bash
code .
```
Isso abrirá o repositório no VS Code. Abra o terminal do VS Code e execute os comandos descritos no Incio da Seção de Execução.

## Autor

- [@Caio Marinho](https://github.com/Caio-Marinho)