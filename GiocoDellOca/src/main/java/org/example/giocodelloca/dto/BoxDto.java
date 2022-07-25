package org.example.giocodelloca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.giocodelloca.entity.BoxType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxDto {

    private BoxType boxType;
    private int     amount;

}
