package br.com.alura.cursos.screenmatch.polymusic;

public class Musica extends Audio {

    private String album;

    public Musica(String artist, String audioName, String date) {
        super(artist, audioName, date);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getAudioName() + ", Classificação: " + this.getClassificacao() + "\n";
    }

    public void displaysMusicInformation() {
        System.out.println("Nome do(a) artista: " + getArtist());
        System.out.println("Nome da Música: " + getAudioName());
        System.out.println("Duração: " + getAudioDurationInMinutes() + " minutos");
        System.out.println("Ano de Lançamento: " + getDate());
        System.out.println("Gênero: " + getAudioGenre());
    }

}