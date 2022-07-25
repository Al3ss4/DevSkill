package org.example.giocodelloca.service;

import org.example.giocodelloca.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

    PlayerDto getPlayer(int id);

    List<PlayerDto> getPlayers();

    PlayerDto createPlayer(PlayerDto playerDto);

}
