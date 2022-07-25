package org.example.giocodelloca.mapper;

import org.example.giocodelloca.dto.BoardDto;
import org.example.giocodelloca.dto.BoxDto;
import org.example.giocodelloca.dto.GameDto;
import org.example.giocodelloca.entity.Board;
import org.example.giocodelloca.entity.Game;

public class GameMapper {

    public static GameDto toGameDto(Game game) {
        GameDto gameDto = new GameDto();
        BoardDto boardDto = new BoardDto();
        BoxDto[] boxDtos = createBoxDtos(game.getBoard());

        boardDto.setBoxes(boxDtos);
        boardDto.setSize(game.getBoard().getSize());

        gameDto.setBoard(boardDto);

        return gameDto;
    }

    private static BoxDto[] createBoxDtos(Board board) {
        BoxDto[] boxDtos = new BoxDto[board.getSize()];

        for (int i = 0; i < board.getBoxes().length; i++) {
            boxDtos[i] = board.getBoxes()[i].toBoxDto();
        }

        return boxDtos;
    }

}
