package org.example.giocodelloca.service.impl;

import org.example.giocodelloca.dao.PlayerDao;
import org.example.giocodelloca.dto.PlayerDto;
import org.example.giocodelloca.entity.Color;
import org.example.giocodelloca.entity.Player;
import org.example.giocodelloca.mapper.PlayerMapper;
import org.example.giocodelloca.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    @Override
    public PlayerDto getPlayer(int id) {
        Player player = playerDao.getPlayer(id);
        return PlayerMapper.toPlayerDto(player);
    }

    @Override
    public List<PlayerDto> getPlayers() {
        List<Player> players = playerDao.getPlayers();
        return PlayerMapper.toPlayerDtos(players);
    }

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        if (colorTaken(playerDto.getColor())) {
            throw new RuntimeException("Color already taken");
        }

        Player player = playerDao.createPlayer(playerDto.getName(), playerDto.getColor());
        return PlayerMapper.toPlayerDto(player);
    }

    private boolean colorTaken(Color color) {
        for (Player player : playerDao.getPlayers()) {
            if (color == player.getColor()) {
                return true;
            }
        }

        return false;
    }

}
