package org.example.giocodelloca.dao;

import org.example.giocodelloca.entity.Game;

public interface GameDao {

    Game createGame(int size);

    Game getGame();

}
