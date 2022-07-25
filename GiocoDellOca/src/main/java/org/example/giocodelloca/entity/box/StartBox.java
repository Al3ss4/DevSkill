package org.example.giocodelloca.entity.box;

import lombok.Data;
import org.example.giocodelloca.dto.BoxDto;
import org.example.giocodelloca.entity.Box;
import org.example.giocodelloca.entity.BoxType;
import org.example.giocodelloca.entity.Player;

@Data
public class StartBox extends Box {

    private static final BoxType TYPE = BoxType.START;

    @Override
    public void updatePlayer(Player player) {
        // Do nothing
    }

    @Override
    public BoxType getType() {
        return TYPE;
    }

    public BoxDto toBoxDto() {
        return new BoxDto(TYPE, 0);
    }

}
