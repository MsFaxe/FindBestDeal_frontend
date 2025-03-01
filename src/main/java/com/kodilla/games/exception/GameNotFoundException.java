package com.kodilla.games.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameNotFoundException extends Exception {
    private final IllegalArgumentException gameNotFoundExcept = new IllegalArgumentException();

    public GameNotFoundException(String message) {
        super(message);
    }
}
