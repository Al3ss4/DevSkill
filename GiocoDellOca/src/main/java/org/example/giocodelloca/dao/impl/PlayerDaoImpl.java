package org.example.giocodelloca.dao.impl;

import org.example.giocodelloca.dao.PlayerDao;
import org.example.giocodelloca.entity.Color;
import org.example.giocodelloca.entity.Player;
import org.example.giocodelloca.entity.PlayerStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    private List<Player> players;

    private int currentId;

    public PlayerDaoImpl() {
        this.players = new ArrayList<>();
        this.currentId = 0;
    }

    @Override
    public Player getPlayer(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }

        throw new RuntimeException("Player not found");
    }

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public Player createPlayer(String name, Color color) {
        Player player = new Player(currentId, name, color, 0, PlayerStatus.ACTIVE);
        players.add(player);

        currentId++;

        return player;
    }

}
