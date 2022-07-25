package org.example.giocodelloca.entity.box;

import lombok.Data;
import org.example.giocodelloca.dto.BoxDto;
import org.example.giocodelloca.entity.Box;
import org.example.giocodelloca.entity.BoxType;
import org.example.giocodelloca.entity.Player;
import org.example.giocodelloca.entity.PlayerStatus;

@Data
public class StopBox extends Box {

    private static final BoxType TYPE = BoxType.STOP;

    @Override
    public void updatePlayer(Player player) {
        player.setStatus(PlayerStatus.STOPPED);
    }

    @Override
    public BoxType getType() {
        return TYPE;
    }

    public BoxDto toBoxDto() {
        return new BoxDto(TYPE, 0);
    }

}
