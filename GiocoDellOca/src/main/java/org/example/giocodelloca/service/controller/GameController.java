package org.example.giocodelloca.service.controller;

import org.example.giocodelloca.dto.GameDto;
import org.example.giocodelloca.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/game")
    public GameDto getGame() {
        return gameService.getGame();
    }

    @PostMapping("/game")
    public GameDto createGame(@RequestBody GameDto gameDto) {
        return gameService.createGame(gameDto);
    }

    @PutMapping("/game")
    public void updateGame() {
        gameService.updateGame();
    }

}
