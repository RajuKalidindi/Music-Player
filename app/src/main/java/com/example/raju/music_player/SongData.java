package com.example.raju.music_player;

public class SongData {
    private String song, artist, url;

    public SongData(){

    }

    public SongData(String song, String artist, String url) {
        this.song = song;
        this.artist = artist;
        this.url = url;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song){
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }
}
