package org.example.giocodelloca.dao.impl;

import org.example.giocodelloca.dao.GameDao;
import org.example.giocodelloca.entity.Board;
import org.example.giocodelloca.entity.Game;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl implements GameDao {

    private Game game;

    @Override
    public Game createGame(int size) {
        Board board = new Board(size);
        this.game = new Game(board);

        return game;
    }

    @Override
    public Game getGame() {
        return game;
    }

}
