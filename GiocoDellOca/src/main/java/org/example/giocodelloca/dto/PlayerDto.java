package org.example.giocodelloca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.giocodelloca.entity.Color;
import org.example.giocodelloca.entity.PlayerStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {

    private int    id;
    private String name;

    private Color color;

    private int          position;
    private PlayerStatus status;

}
