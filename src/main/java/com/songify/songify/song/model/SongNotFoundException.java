package com.songify.songify.song.model;

public class SongNotFoundException extends RuntimeException {
    public SongNotFoundException(String message){
        super(message);
    }
}
