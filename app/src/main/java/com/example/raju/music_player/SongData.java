package com.example.raju.music_player;

public class SongData {
    public String sname, artist, url;

    public SongData(){

    }

    public SongData(String sname, String artist, String url) {
        this.sname = sname;
        this.artist = artist;
        this.url = url;
    }

    public String getSname() {
        return sname;
    }

    public String getArtist() {
        return artist;
    }

    public String getUrl() {
        return url;
    }
}
