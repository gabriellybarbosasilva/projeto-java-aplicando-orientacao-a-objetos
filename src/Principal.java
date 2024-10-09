import br.com.alura.cursos.screenmatch.polymusic.Musica;
import br.com.alura.cursos.screenmatch.polymusic.Audio;
import br.com.alura.cursos.screenmatch.polymusic.Playlist;
import br.com.alura.cursos.screenmatch.polymusic.Podcast;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Musica musica1 = new Musica();
        musica1.setArtist("Black Friday");
        musica1.setAudioName("Tom Odell");
        musica1.setAudioDurationInMinutes(3.7);
        musica1.setYear(2023);
        musica1.setAudioGenre("Indie");
        musica1.setNumberOfViews(162339732);

        Musica musica2 = new Musica();
        musica2.setArtist("Cícero");
        musica2.setAudioName("Açúcar ou Adoçante?");
        musica2.setAudioDurationInMinutes(4.37);
        musica2.setYear(2011);
        musica2.setAudioGenre("Indie");
        musica2.setNumberOfViews(15641953);

        Musica musica3 = new Musica();
        musica3.setArtist("Billie Eilish");
        musica3.setAudioGenre("CHIHIRO");
        musica3.setAudioDurationInMinutes(5.05);
        musica3.setYear(2024);
        musica3.setAudioGenre("Indie");
        musica3.setNumberOfViews(451967098);

        Musica musica4 = new Musica();
        musica4.setArtist("The Weeknd, JENNIE, Lily Rose Depp");
        musica4.setAudioGenre("One Of The Girls");
        musica4.setAudioDurationInMinutes(4.07);
        musica4.setYear(2023);
        musica4.setAudioGenre("Pop");
        musica4.setNumberOfViews(1278587882);

        Musica musica5 = new Musica();
        musica5.setArtist("Lady Gaga, Bruno Mars");
        musica5.setAudioGenre("Die With A Smile");
        musica5.setAudioDurationInMinutes(4.2);
        musica5.setYear(2024);
        musica5.setAudioGenre("Pop");
        musica5.setNumberOfViews(535859412);

        Musica musica6 = new Musica();
        musica6.setArtist("Sabrina Carpenter");
        musica6.setAudioGenre("Taste");
        musica6.setAudioDurationInMinutes(2.62);
        musica6.setYear(2024);
        musica6.setAudioGenre("Pop");
        musica6.setNumberOfViews(318651503);
        Podcast podcast1 = new Podcast();
        podcast1.setArtist("O Assunto");
        podcast1.setAudioName("Vitórias e derrotas do 1º turno");
        podcast1.setDescription("No primeiro saldo das eleições municipais, quem saiu na frente foram" +
                " os candidatos que representam a continuidade e que defendem partidos posicionados à direita.");
        podcast1.setAudioDurationInMinutes(32.82);
        podcast1.setDate("out. de 2024");
        podcast1.setAudioGenre("Notícia");


        Podcast podcast2 = new Podcast();
        podcast2.setArtist("Café da Manhã");
        podcast2.setAudioName("Felipe Neto: política, ódio, livros e Flip");
        podcast2.setDescription("O anúncio de que Felipe Neto será um dos convidados da Flip, evento que " +
                "começa na próxima quarta-feira (9), recebeu críticas nas redes sociais pela participação " +
                "de um influenciador em meio a nomes premiados do mercado literário.");
        podcast2.setAudioDurationInMinutes(44.87);
        podcast2.setDate("out. de 2024");
        podcast2.setAudioGenre("Notícia");

        Podcast podcast3 = new Podcast();
        podcast3.setArtist("Quinta Misteriosa");
        podcast3.setAudioName("O estranho caso de Alexee Trevizo");
        podcast3.setDescription("Alexee Trevizo, de 19 anos de idade, deu à luz ao seu filho no banheiro de um " +
                "hospital, ela alegou que a criança nasceu morta e a única solução que encontrou " +
                "em um momento de desespero foi colocar o bebê dentro do lixo. Meses depois, ela é " +
                "acusada de assassinato. Seu filho realmente nasceu sem vida?");
        podcast3.setAudioDurationInMinutes(20.47);
        podcast3.setDate("out. de 2024");
        podcast3.setAudioGenre("Thriller");

        Podcast podcast4 = new Podcast();
        podcast4.setArtist("Operação Prato");
        podcast4.setAudioName("Episódio 1 - Luzes no céu");
        podcast4.setDescription("Maior caso ufológico da história do Brasil. Uma luz que se dizia capaz de sugar " +
                "o sangue de suas vítimas, que gerou pânico e caos em municípios isolados.");
        podcast4.setAudioDurationInMinutes(64.98);
        podcast4.setDate("set. de 2024");
        podcast4.setAudioGenre("Ufologia");

        Podcast podcast5 = new Podcast();
        podcast5.setArtist("Quinta Misteriosa");
        podcast5.setAudioName("O assassino da voz chorosa | Paul Stephani");
        podcast5.setDescription("Por dois anos na década de 1980, um misterioso assassino ligava para a polícia " +
                "com uma voz chorosa para se desculpar quando matava ou atacava uma mulher.");
        podcast5.setDate("set. de 2024");
        podcast5.setAudioDurationInMinutes(23.13);
        podcast5.setAudioGenre("Thriller");

        Podcast podcast6 = new Podcast();
        podcast6.setArtist("Felipe Castanhari");
        podcast6.setAudioName("Michael Jackson - Culpado ou Inocente?");
        podcast6.setDescription("Culpado? Inocente? Conheça as alegações, as evidências e tudo o que se sabe " +
                "- e que não se sabe - em todas as acusações de abuso sexual que Michael Jackson " +
                "enfrentou na vida.");
        podcast6.setDate("set. de 2023");
        podcast6.setAudioDurationInMinutes(146);
        podcast6.setAudioGenre("História");

        do {

            System.out.println("***********************************************************************************");
            System.out.println("Bem-vindo ao PolyMusic! Temos uma lista de músicas e podcasts que você pode gostar!");
            System.out.println("O que você vai querer ouvir?\n");
            System.out.println("Selecione 1 para ouvir apenas músicas");
            System.out.println("Selecione 2 para ouvir apenas podcast");
            System.out.println("Selecione 3 para ouvir ambos");
            System.out.println("Selecione 4 para sair :(");
            System.out.println("***********************************************************************************");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Você está ouvindo as músicas do momento!");
                    musica1.displaysMusicInformation();
                    musica2.displaysMusicInformation();
                    musica3.displaysMusicInformation();
                    musica4.displaysMusicInformation();
                    musica5.displaysMusicInformation();
                    musica6.displaysMusicInformation();
                    break;

                case 2:
                    System.out.println("Você está ouvindo os podcasts do momento!");
                    podcast1.displaysPodcastInformation();
                    podcast2.displaysPodcastInformation();
                    podcast3.displaysPodcastInformation();
                    podcast4.displaysPodcastInformation();
                    podcast5.displaysPodcastInformation();
                    podcast6.displaysPodcastInformation();
                    break;

                case 3:
                    System.out.println("Você está ouvindo a rádio polymusic! Uma mistura de música e podcasts.");
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

        } while (choice != 4);
    }
}