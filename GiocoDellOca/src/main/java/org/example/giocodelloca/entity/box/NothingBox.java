package org.example.giocodelloca.entity.box;

import org.example.giocodelloca.dto.BoxDto;
import org.example.giocodelloca.entity.Box;
import org.example.giocodelloca.entity.BoxType;
import org.example.giocodelloca.entity.Player;

public class NothingBox extends Box {

    private static final BoxType TYPE = BoxType.NOTHING;

    @Override
    public void updatePlayer(Player player) {
        // Do nothing
    }

    @Override
    public BoxType getType() {
        return TYPE;
    }

    @Override
    public BoxDto toBoxDto() {
        return new BoxDto(TYPE, 0);
    }
}
