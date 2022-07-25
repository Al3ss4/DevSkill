package org.example.giocodelloca.service;

import org.example.giocodelloca.dto.GameDto;

public interface GameService {

    GameDto getGame();

    GameDto createGame(GameDto gameDto);

    void updateGame();

}
