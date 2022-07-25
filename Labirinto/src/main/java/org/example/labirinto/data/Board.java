package org.example.labirinto.data;

import org.example.labirinto.dto.BoardDto;

import java.util.ArrayList;

public class Board {

    public static final int ROWS    = 8;
    public static final int COLUMNS = 12;

    private BoxType[][] boxes;

    public Board() {

        this.boxes = new BoxType[][] {
                { BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.EMPTY,
                        BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.EMPTY, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EMPTY, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL },
                { BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.EXIT, BoxType.WALL,
                        BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL, BoxType.WALL }
        };

    }

    public BoxType getBox(Position position) {
        return boxes[position.getRow()][position.getColumn()];
    }

    public void setBox(Position position, BoxType type) {
        boxes[position.getRow()][position.getColumn()] = type;
    }

    public BoardDto toDto() {
        BoardDto boardDto = new BoardDto();

        for (int i = 0; i < ROWS; i++) {
            boardDto.getBoard().add(new ArrayList<>());

            for (int j = 0; j < COLUMNS; j++) {
                boardDto.getBoard().get(i).add(boxes[i][j]);
            }
        }

        return boardDto;
    }

}
