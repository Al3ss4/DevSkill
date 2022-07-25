package org.example.labirinto.controller;

import org.example.labirinto.data.Direction;
import org.example.labirinto.dto.BoardDto;
import org.example.labirinto.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @PutMapping("/move/{direction}")
    public void move(@PathVariable Direction direction) {
        gameService.move(direction);
    }

    @GetMapping("/state")
    public BoardDto getState() {
        return gameService.getState();
    }

    @PostMapping("/reset")
    public void reset() {
        gameService.reset();
    }

}
