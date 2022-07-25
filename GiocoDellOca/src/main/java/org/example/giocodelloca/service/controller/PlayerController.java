package org.example.giocodelloca.service.controller;

import org.example.giocodelloca.dto.PlayerDto;
import org.example.giocodelloca.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/player/{id}")
    public PlayerDto getPlayer(@PathVariable int id) {
        return playerService.getPlayer(id);
    }

    @PostMapping("/player")
    public PlayerDto newPlayer(@RequestBody PlayerDto playerDto) {
        return playerService.createPlayer(playerDto);
    }

    @GetMapping("/players")
    public List<PlayerDto> getPlayers() {
        return playerService.getPlayers();
    }

}
