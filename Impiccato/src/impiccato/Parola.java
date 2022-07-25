package impiccato;

public class Parola {

    private String parola;

    private boolean[] lettereIndovinate;

    public Parola(String parola) {
        this.parola = parola;
        this.lettereIndovinate = new boolean[parola.length()];
    }

    public boolean nuovaLettera(char lettera) {
        boolean letteraTrovata = false;

        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) == lettera) {
                letteraTrovata = true;
                lettereIndovinate[i] = true;
            }
        }

        return letteraTrovata;
    }

    public boolean isIndovinata() {
        for (int i = 0; i < lettereIndovinate.length; i++) {
            if (!lettereIndovinate[i]) {
                return false;
            }
        }

        return true;
    }

    public void stampa() {
        for (int i = 0; i < lettereIndovinate.length; i++) {
            if (lettereIndovinate[i]) {
                System.out.print(parola.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }

        System.out.println();
    }
}
