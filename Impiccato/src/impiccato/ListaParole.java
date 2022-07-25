package impiccato;

import java.util.Random;

public class ListaParole {

    private static final String[] PAROLE = {
            "MACCHINA",
            "TAVOLO",
            "GATTO",
            "CANE"
    };

    public String getParolaACaso() {
        int indiceRandom = new Random().nextInt(PAROLE.length);
        return PAROLE[indiceRandom];
    }

}
