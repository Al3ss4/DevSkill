package springtest.dto;

public class Persona {


    private String nome;

    private String cognome;

    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
}
