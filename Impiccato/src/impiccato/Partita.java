package impiccato;

import java.util.Scanner;

public class Partita {

    private Scanner scanner;

    private Giocatore giocatore;
    private Parola    parola;

    public Partita() {
        this.scanner = new Scanner(System.in);

        ListaParole listaParole = new ListaParole();
        this.giocatore = new Giocatore();
        this.parola = new Parola(listaParole.getParolaACaso());
    }

    public void inizia() {
        System.out.println("Benvenuto all'impiccato!");
        parola.stampa();
    }

    public void prossimaLettera() {
        System.out.print("Inserisci lettera: ");
        String input = scanner.nextLine().toUpperCase();

        if (input.length() == 0) {
            System.out.println("Non hai inserito nessuna lettera");
            return;
        }

        if (input.length() > 1) {
            System.out.println("Hai inserito più di una lettera");
            return;
        }

        char lettera = input.charAt(0);

        if (!parola.nuovaLettera(lettera)) {
            System.out.println("ERRORE!");
            giocatore.perdiVita();
        } else {
            System.out.println("OK!");
        }

        giocatore.stampaVite();
        parola.stampa();
    }

    public boolean isFinita() {
        if (parola.isIndovinata()) {
            return true;
        }

        if (!giocatore.isVivo()) {
            return true;
        }

        return false;
    }

    public boolean isVinta() {
        if (parola.isIndovinata()) {
            return true;
        }

        if (!giocatore.isVivo()) {
            return false;
        }

        return false;
    }
}
