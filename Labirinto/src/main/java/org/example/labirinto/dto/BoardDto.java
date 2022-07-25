package org.example.labirinto.dto;

import org.example.labirinto.data.BoxType;

import java.util.ArrayList;
import java.util.List;

public class BoardDto {

    private List<List<BoxType>> board = new ArrayList<>();

    public List<List<BoxType>> getBoard() {
        return board;
    }

}
