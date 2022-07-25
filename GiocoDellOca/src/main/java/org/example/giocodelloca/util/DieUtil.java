package org.example.giocodelloca.util;

import java.util.Random;

public class DieUtil {

    public static int throwDie() {
        return new Random().nextInt(6) + 1;
    }

}
