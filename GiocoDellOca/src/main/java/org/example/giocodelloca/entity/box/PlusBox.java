package org.example.giocodelloca.entity.box;

import lombok.Data;
import org.example.giocodelloca.dto.BoxDto;
import org.example.giocodelloca.entity.Box;
import org.example.giocodelloca.entity.BoxType;
import org.example.giocodelloca.entity.Player;

@Data
public class PlusBox extends Box {

    private static final BoxType TYPE = BoxType.PLUS;

    private int amount;

    public PlusBox(int amount) {
        this.amount = amount;
    }

    @Override
    public void updatePlayer(Player player) {
        int newPosition = player.getPosition() + amount;
        player.setPosition(newPosition);
    }

    @Override
    public BoxType getType() {
        return TYPE;
    }

    public BoxDto toBoxDto() {
        return new BoxDto(TYPE, amount);
    }

}
