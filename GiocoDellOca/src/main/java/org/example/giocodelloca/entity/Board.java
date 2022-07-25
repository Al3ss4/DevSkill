package org.example.giocodelloca.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.giocodelloca.entity.box.*;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    private static final int RANDOM_STOP_PERCENT    = 15;
    private static final int RANDOM_NOTHING_PERCENT = 75;

    private Box[] boxes;
    private int   size;

    public Board(int size) {
        this.size = size;
        this.boxes = new Box[size];

        initBoxes();
    }

    public Box getBoxAt(int index) {
        return boxes[index];
    }

    private void initBoxes() {
        this.boxes[0] = new StartBox();

        Random random = new Random();

        for (int i = 1; i < size - 1; i++) {
            int randomInt = random.nextInt(100);
            BoxType randomType;

            if (randomInt < RANDOM_STOP_PERCENT) {
                // STOP;
                boxes[i] = new StopBox();
            } else if (randomInt < RANDOM_NOTHING_PERCENT) {
                // NOTHING;
                boxes[i] = new NothingBox();
            } else {
                boxes[i] = new PlusBox(random.nextInt(7) - 3);
            }
        }

        boxes[size - 1] = new EndBox();
    }
}
