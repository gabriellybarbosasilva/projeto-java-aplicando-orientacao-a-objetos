import br.com.alura.cursos.screenmatch.polymusic.Musica;
import br.com.alura.cursos.screenmatch.polymusic.Podcast;
import br.com.alura.cursos.screenmatch.polymusic.escolha;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal implements escolha {



    @Override
    public void getformulario() {
        System.out.println("***********************************************************************************");
        System.out.println("Selecione 1 para ouvir apenas músicas");
        System.out.println("Selecione 2 para ouvir apenas podcast");
        System.out.println("Selecione 3 para ouvir ambos");
        System.out.println("Selecione 4 para sair :(");
        System.out.println("***********************************************************************************\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Musica musica1 = new Musica("Tom Odell", "Black Friday", "2023");
        musica1.setAudioDurationInMinutes(3.7);
        musica1.setNumberOfViews(162339732);
        musica1.setAudioGenre("Indie\n");


        Musica musica2 = new Musica("Cícero", "Açúcar ou Adoçante?", "2011");
        musica2.setAudioDurationInMinutes(4.37);
        musica2.setNumberOfViews(15641953);
        musica2.setAudioGenre("Indie\n");


        Musica musica3 = new Musica("Billie Eilish", "CHIHIRO", "2024");
        musica3.setAudioDurationInMinutes(5.05);
        musica3.setNumberOfViews(451967098);
        musica3.setAudioGenre("Indie\n");


        Musica musica4 = new Musica(
                "The Weeknd, JENNIE, Lily Rose Depp", "One Of The Girls", "2023");
        musica4.setAudioDurationInMinutes(4.07);
        musica4.setNumberOfViews(1278587882);
        musica4.setAudioGenre("Pop\n");


        Musica musica5 = new Musica("Lady Gaga, Bruno Mars", "Die With A Smile", "2024");
        musica5.setAudioDurationInMinutes(4.2);
        musica5.setNumberOfViews(535859412);
        musica5.setAudioGenre("Pop\n");


        Musica musica6 = new Musica("Sabrina Carpenter", "Taste", "2024");
        musica6.setAudioDurationInMinutes(2.62);
        musica6.setNumberOfViews(318651503);
        musica6.setAudioGenre("Pop\n");

        Podcast podcast1 = new Podcast(
                "O Assunto", "Vitórias e derrotas do 1º turno", "out. de 2024");
        podcast1.setDescription("No primeiro saldo das eleições municipais, quem saiu na frente foram" +
                " os candidatos que representam a continuidade e que defendem partidos posicionados à direita.");
        podcast1.setAudioDurationInMinutes(32.82);
        podcast1.setNumberOfViews(8374912);
        podcast1.setAudioGenre("Notícia\n");



        Podcast podcast2 = new Podcast(
                "Café da Manhã", "Felipe Neto: política, ódio, livros e Flip", "out. de 2024");
        podcast2.setDescription("O anúncio de que Felipe Neto será um dos convidados da Flip, evento que " +
                "começa na próxima quarta-feira (9), recebeu críticas nas redes sociais pela participação " +
                "de um influenciador em meio a nomes premiados do mercado literário.");
        podcast2.setAudioDurationInMinutes(44.87);
        podcast2.setNumberOfViews(150000);
        podcast2.setAudioGenre("Notícia\n");

        Podcast podcast3 = new Podcast(
                "Quinta Misteriosa", "O estranho caso de Alexee Trevizo", "out. de 2024");
        podcast3.setDescription("Alexee Trevizo, de 19 anos de idade, deu à luz ao seu filho no banheiro de um " +
                "hospital, ela alegou que a criança nasceu morta e a única solução que encontrou " +
                "em um momento de desespero foi colocar o bebê dentro do lixo. Meses depois, ela é " +
                "acusada de assassinato. Seu filho realmente nasceu sem vida?");
        podcast3.setAudioDurationInMinutes(20.47);
        podcast3.setNumberOfViews(350000);
        podcast3.setAudioGenre("Thriller\n");

        Podcast podcast4 = new Podcast(
                "Operação Prato", "Episódio 1 - Luzes no céu", "set. de 2024");
        podcast4.setDescription("Maior caso ufológico da história do Brasil. Uma luz que se dizia capaz de sugar " +
                "o sangue de suas vítimas, que gerou pânico e caos em municípios isolados.");
        podcast4.setAudioDurationInMinutes(64.98);
        podcast4.setNumberOfViews(500000);
        podcast4.setAudioGenre("Ufologia\n");

        Podcast podcast5 = new Podcast(
                "Quinta Misteriosa", "O assassino da voz chorosa | Paul Stephani", "set. de 2024"
        );
        podcast5.setDescription("Por dois anos na década de 1980, um misterioso assassino ligava para a polícia " +
                "com uma voz chorosa para se desculpar quando matava ou atacava uma mulher.");
        podcast5.setAudioDurationInMinutes(23.13);
        podcast5.setNumberOfViews(250000);
        podcast5.setAudioGenre("Thriller\n");

        Podcast podcast6 = new Podcast(
                "Felipe Castanhari", "Michael Jackson - Culpado ou Inocente?", "set. de 2023"
        );
        podcast6.setDescription("Culpado? Inocente? Conheça as alegações, as evidências e tudo o que se sabe " +
                "- e que não se sabe - em todas as acusações de abuso sexual que Michael Jackson " +
                "enfrentou na vida.");
        podcast6.setAudioDurationInMinutes(146);
        podcast6.setNumberOfViews(800000);
        podcast6.setAudioGenre("História\n");

        Principal main = new Principal();

        ArrayList<Podcast> Podcasts = new ArrayList<>();
        Podcasts.add(podcast1);
        Podcasts.add(podcast2);
        Podcasts.add(podcast3);
        Podcasts.add(podcast4);
        Podcasts.add(podcast5);
        Podcasts.add(podcast6);
        System.out.println("O tamanho da lista é de " + Podcasts.size() + " podcasts.");
        System.out.println("O filme na posição 1 é: " + Podcasts.get(0));
        System.out.println(Podcasts);

        /*do {

            System.out.println("***********************************************************************************");
            System.out.println("Bem-vindo ao PolyMusic! Temos uma lista de músicas e podcasts que você pode gostar!");
            System.out.println("O que você vai querer ouvir?\n");
            main.getformulario();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("\nVocê está ouvindo as músicas do momento!");
                    musica1.displaysMusicInformation();
                    musica2.displaysMusicInformation();
                    musica3.displaysMusicInformation();
                    musica4.displaysMusicInformation();
                    musica5.displaysMusicInformation();
                    musica6.displaysMusicInformation();
                    break;

                case 2:
                    System.out.println("\nVocê está ouvindo os podcasts do momento!");
                    podcast1.displaysPodcastInformation();
                    podcast2.displaysPodcastInformation();
                    podcast3.displaysPodcastInformation();
                    podcast4.displaysPodcastInformation();
                    podcast5.displaysPodcastInformation();
                    podcast6.displaysPodcastInformation();
                    break;

                case 3:
                    System.out.println("\nVocê está ouvindo a rádio polymusic! Uma mistura de música e podcasts.");
                    musica1.displaysMusicInformation();
                    podcast1.displaysPodcastInformation();
                    musica2.displaysMusicInformation();
                    podcast2.displaysPodcastInformation();
                    musica3.displaysMusicInformation();
                    podcast3.displaysPodcastInformation();
                    musica4.displaysMusicInformation();
                    podcast4.displaysPodcastInformation();
                    musica5.displaysMusicInformation();
                    podcast5.displaysPodcastInformation();
                    musica6.displaysMusicInformation();
                    podcast6.displaysPodcastInformation();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (choice != 4);*/
    }


}