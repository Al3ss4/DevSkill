package org.example.giocodelloca.entity;

import org.example.giocodelloca.dto.BoxDto;

public abstract class Box {

    public abstract void updatePlayer(Player player);

    public abstract BoxType getType();

    public abstract BoxDto toBoxDto();

}
