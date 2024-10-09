package br.com.alura.cursos.screenmatch.polymusic;

public class Audio {
    private String artist;
    private String audioName;
    private double audioDurationInMinutes;
    private String audioGenre;
    private int numberOfViews;

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

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public double getAudioDurationInMinutes() {
        return audioDurationInMinutes;
    }

    // Método para somar a duração total de uma lista de áudios
    public static double calculatePlaylistDuration(Audio[] audios) {
        double totalDuration = 0;
        for (Audio audio : audios) {
            totalDuration += audio.getAudioDurationInMinutes();
        }
        return totalDuration;
    }
}