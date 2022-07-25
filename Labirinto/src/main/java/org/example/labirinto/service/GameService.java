package org.example.labirinto.service;

import org.example.labirinto.data.Direction;
import org.example.labirinto.dto.BoardDto;

public interface GameService {

    void move(Direction direction);

    BoardDto getState();

    void reset();

}
