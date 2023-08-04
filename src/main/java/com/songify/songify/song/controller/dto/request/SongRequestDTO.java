package com.songify.songify.song.controller.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record SongRequestDTO(
    @NotNull(message = "song must be not null" )
    @NotEmpty(message = "song must be not empty" )
    String songName,

    @NotNull(message = "artist must be not null" )
    @NotEmpty(message = "artist must be not empty" )
    String artist) {
    
}
