package org.example.giocodelloca.mapper;

import org.example.giocodelloca.dto.PlayerDto;
import org.example.giocodelloca.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {

    public static PlayerDto toPlayerDto(Player player) {
        return new PlayerDto(player.getId(), player.getName(), player.getColor(),
                             player.getPosition(), player.getStatus());
    }

    public static List<PlayerDto> toPlayerDtos(List<Player> players) {
        List<PlayerDto> playerDtos = new ArrayList<>();

        for (Player player : players) {
            playerDtos.add(toPlayerDto(player));
        }

        return playerDtos;
    }

    public static Player toPlayer(PlayerDto playerDto, int id) {
        return new Player(id, playerDto.getName(), playerDto.getColor(), playerDto.getPosition(),
                          playerDto.getStatus());
    }
}
