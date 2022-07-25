package org.example.labirinto.service.impl;

import org.example.labirinto.data.Board;
import org.example.labirinto.data.BoxType;
import org.example.labirinto.data.Direction;
import org.example.labirinto.data.Position;
import org.example.labirinto.dto.BoardDto;
import org.example.labirinto.service.GameService;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private Board board;

    private Position playerPosition = new Position(0, 0);

    public GameServiceImpl() {
        this.board = new Board();
        board.setBox(playerPosition, BoxType.PLAYER);
    }

    @Override
    public void move(Direction direction) {
        Position newPlayerPosition = new Position(playerPosition.getRow(), playerPosition.getColumn());

        switch (direction) {
            case UP:
                newPlayerPosition.incrementRow(-1);
                break;
            case DOWN:
                newPlayerPosition.incrementRow(1);
                break;
            case LEFT:
                newPlayerPosition.incrementColumn(-1);
                break;
            case RIGHT:
                newPlayerPosition.incrementColumn(1);
                break;
        }

        if (newPlayerPosition.getRow() < 0 ||
                newPlayerPosition.getRow() >= Board.ROWS ||
                newPlayerPosition.getColumn() < 0 ||
                newPlayerPosition.getColumn() >= Board.COLUMNS ||
                board.getBox(newPlayerPosition) != BoxType.EMPTY) {
            return;
        }

        board.setBox(playerPosition, BoxType.EMPTY);
        playerPosition = newPlayerPosition;
        board.setBox(playerPosition, BoxType.PLAYER);
    }

    @Override
    public BoardDto getState() {
        return board.toDto();
    }

    @Override
    public void reset() {
        board.setBox(playerPosition, BoxType.EMPTY);
        playerPosition = new Position(0, 0);
        board.setBox(playerPosition, BoxType.PLAYER);
    }
}
