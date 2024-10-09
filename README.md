
# README do Projeto PolyMusic 

## Descrição do Projeto
O PolyMusic é uma aplicação Java que permite ao usuário escolher entre ouvir músicas, podcasts ou ambos. A aplicação simula uma experiência de rádio personalizada, exibindo informações sobre músicas e podcasts populares.

## Estrutura do Projeto
O projeto está organizado em cinco arquivos principais:

### Classe `Audio`
A classe `Audio` é a classe base que contém os atributos e métodos comuns para todos os tipos de áudios (músicas e podcasts). Essa classe contém os seguintes atributos:

- `artist:` Nome do artista ou do criador do podcast.
- `audioName:` Nome da música ou do episódio do podcast.
- `audioDurationInMinutes:` Duração do áudio em minutos.
- `audioGenre:` Gênero do áudio.
- `numberOfViews:` Número de visualizações ou reproduções do áudio.
Além disso, a classe contém métodos getters e setters para manipular esses atributos.

### Classe `Musica`
A classe `Musica` herda de `Audio` e inclui atributos específicos para músicas, como:

`year:` O ano de lançamento da música.
Métodos adicionais incluem `displaysMusicInformation()`, que imprime todas as informações sobre uma música no console.

### Classe `Podcast`
A classe `Podcast` também herda de `Audio` e adiciona atributos exclusivos para podcasts, como:

- `description:` Descrição do episódio do podcast. 
- `date:` Data de lançamento do podcast.
Assim como na classe `Musica`, há um método `displaysPodcastInformation()`, que imprime as informações do podcast.

### Interface `escolha`
A interface `escolha` define o contrato para as classes que implementam o método `getformulario()`. Este método é usado para apresentar ao usuário as opções de escolha (músicas, podcasts, ambos, ou sair do programa).

### Classe `Principal`
A classe `Principal` implementa a interface `escolha` e contém o método `main()`, que é o ponto de entrada da aplicação. Nessa classe, temos a seguinte lógica:

- Inicialização de objetos das classes `Musica` e `Podcast`.
- Um loop `do-while` que exibe o menu de opções para o usuário, permitindo que ele escolha entre ouvir músicas, podcasts, ambos, ou sair da aplicação.
- Dependendo da escolha do usuário, a aplicação exibe as informações relevantes dos áudios (músicas ou podcasts) por meio dos métodos `displaysMusicInformation()` e `displaysPodcastInformation()`.

## Funcionamento da Aplicação
1. Ao iniciar a aplicação, o usuário é apresentado a um menu com as seguintes opções:
    - 1: Ouvir apenas músicas. 
    - 2: Ouvir apenas podcasts. 
    - 3: Ouvir ambos (músicas e podcasts). 
    - 4: Sair da aplicação.

2. Dependendo da opção selecionada, o programa exibe as informações das músicas e/ou podcasts disponíveis.

3. O loop continua até que o usuário escolha a opção de sair (opção 4).

## Como Rodar a Aplicação
1. Clone o repositório para sua máquina local.
2. Abra o projeto em um ambiente de desenvolvimento Java, como o Eclipse ou IntelliJ IDEA.
3. Execute o arquivo Principal.java, que contém o método main().
4. Siga as instruções exibidas no console para interagir com a aplicação.

## Tecnologias Utilizadas
- *Java:* Linguagem de programação utilizada para desenvolver a aplicação.
- *Orientação a Objetos:* O projeto utiliza conceitos de herança e polimorfismo.
- *Interface:* Para definir o comportamento de classes que devem exibir o menu de escolha. 


## Estrutura de Diretórios


    └── br
        └── com
            └── alura
                └── cursos
                    └── screenmatch
                        └── polymusic
                            ├── Audio.java
                            ├── Musica.java
                            ├── Podcast.java
                            ├── Principal.java
                            └── escolha.java
## Melhorias Futuras
- Adicionar suporte para listas dinâmicas de músicas e podcasts.
- Permitir a adição de novos áudios pelo usuário.
- Implementar um sistema de avaliações para cada áudio.