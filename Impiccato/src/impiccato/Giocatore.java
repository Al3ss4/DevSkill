package impiccato;

public class Giocatore {

    private static final int VITE_DEFAULT = 5;

    private int vite = VITE_DEFAULT;

    public void perdiVita() {
        vite--;
    }

    public boolean isVivo() {
        return vite > 0;
    }

    public void stampaVite() {
        System.out.println("Vite rimaste: " + vite);
    }
}
