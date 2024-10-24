package br.com.alura.cursos.screenmatch.polymusic;

public class Audio implements Comparable<Audio>{
    private String artist;
    private String audioName;
    private double audioDurationInMinutes;
    private String audioGenre;
    private int numberOfViews;
    private String date;
    private int classificacao;



    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Audio(String artist, String audioName, String date) {
        this.artist = artist;
        this.audioName = audioName;
        this.date = date;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public void setAudioDurationInMinutes(double audioDurationInMinutes) {
        this.audioDurationInMinutes = audioDurationInMinutes;
    }

    public String getAudioGenre() {
        return audioGenre;
    }

    public void setAudioGenre(String audioGenre) {
        this.audioGenre = audioGenre;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int i) {
        this.numberOfViews = numberOfViews;
    }

    public double getAudioDurationInMinutes() {
        return audioDurationInMinutes;
    }

    @Override
    public int compareTo(Audio outroAudio) {
        return this.getAudioName().compareTo(outroAudio.getAudioName());
    }

    @Override
    public String toString() {
        return "Nome: " + getAudioName() + ", " + "Artista: " + getArtist() + ", " + "Data: " + getDate() + "\n";
    }
}