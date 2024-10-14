package br.com.alura.cursos.screenmatch.polymusic;

public class Musica extends Audio {

    private int year;
    private String album;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public void displaysMusicInformation() {
        System.out.println("Nome do(a) artista: " + getArtist());
        System.out.println("Nome da Música: " + getAudioName());
        System.out.println("Duração: " + getAudioDurationInMinutes() + " minutos");
        System.out.println("Ano de Lançamento: " + getYear());
        System.out.println("Gênero: " + getAudioGenre());
    }

}