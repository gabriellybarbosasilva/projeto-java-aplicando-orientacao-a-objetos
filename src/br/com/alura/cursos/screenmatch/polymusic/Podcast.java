package br.com.alura.cursos.screenmatch.polymusic;

public class Podcast extends Audio{
    private String description;

    public Podcast(String artist, String audioName, String date) {
        super(artist, audioName, date);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getAudioName() + ", Classificação: " + this.getClassificacao() + "\n";
    }

    public void displaysPodcastInformation() {
        System.out.println("Nome do Podcast: " + getArtist());
        System.out.println("Nome do Áudio: " + getAudioName());
        System.out.println("Descrição: " + getDescription());
        System.out.println("Duração: " + getAudioDurationInMinutes() + " minutos");
        System.out.println("Data de Lançamento: " + getDate());
        System.out.println("Gênero: " + getAudioGenre());
    }

}