package org.example.giocodelloca.dao;

import org.example.giocodelloca.entity.Color;
import org.example.giocodelloca.entity.Player;

import java.util.List;

public interface PlayerDao {

    Player getPlayer(int id);

    List<Player> getPlayers();

    Player createPlayer(String name, Color color);

}
