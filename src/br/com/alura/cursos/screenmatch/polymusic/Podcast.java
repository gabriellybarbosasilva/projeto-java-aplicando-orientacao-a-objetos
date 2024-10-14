package br.com.alura.cursos.screenmatch.polymusic;

public class Podcast extends Audio{
    private String description;
    private String date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "O episódio é " + this.getAudioName() + " lançado em " + this.getDate();
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