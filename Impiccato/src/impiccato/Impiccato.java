package impiccato;

public class Impiccato {

    public static void main(String[] args) {
        Partita partita = new Partita();

        partita.inizia();

        do {
            partita.prossimaLettera();
        } while (!partita.isFinita());

        if (partita.isVinta()) {
            System.out.println("Hai vinto, evviva!");
        } else {
            System.out.println("Hai perso, mi spiace!");
        }

    }

}
