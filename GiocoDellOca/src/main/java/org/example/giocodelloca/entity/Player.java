package org.example.giocodelloca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private int    id;
    private String name;

    private Color color;

    private int          position;
    private PlayerStatus status;

}
