package org.example.giocodelloca.service.impl;

import org.example.giocodelloca.dao.GameDao;
import org.example.giocodelloca.dao.PlayerDao;
import org.example.giocodelloca.dto.GameDto;
import org.example.giocodelloca.entity.Box;
import org.example.giocodelloca.entity.Game;
import org.example.giocodelloca.entity.Player;
import org.example.giocodelloca.mapper.GameMapper;
import org.example.giocodelloca.service.GameService;
import org.example.giocodelloca.util.DieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    @Autowired
    private PlayerDao playerDao;

    private Player activePlayer;

    @Override
    public GameDto getGame() {
        Game game = gameDao.getGame();
        return GameMapper.toGameDto(game);
    }

    @Override
    public GameDto createGame(GameDto gameDto) {
        if (playerDao.getPlayers().size() < 2) {
            throw new RuntimeException("Not enough players");
        }

        Game game = gameDao.createGame(gameDto.getBoard().getSize());
        activePlayer = playerDao.getPlayer(0);

        return GameMapper.toGameDto(game);
    }

    @Override
    public void updateGame() {
        Game game = gameDao.getGame();
        int lastBoxIndex = game.getBoard().getSize() - 1;

        int diceResult = DieUtil.throwDie();

        int newPlayerPosition = activePlayer.getPosition() + diceResult;
        if (newPlayerPosition > lastBoxIndex) {
            newPlayerPosition = lastBoxIndex - (newPlayerPosition - lastBoxIndex);
        }

        do {
            Box newBox = game.getBoard().getBoxAt(newPlayerPosition);
            newBox.updatePlayer(activePlayer);
        } while (newPlayerPosition != activePlayer.getPosition());

        int nextPlayerId = (activePlayer.getId() + 1) % playerDao.getPlayers().size();
        activePlayer = playerDao.getPlayer(nextPlayerId);

        // TODO Manca roba (tipo la condizione di vittoria)
    }

}
