package concessionaria.dati.veicoli;

import concessionaria.dati.enums.TipoVeicolo;
import lombok.Getter;

@Getter
public abstract class Veicolo {

    private String nome;

    private String marca;

    private int cilindrata;
    private int annoProduzione;
    private int prezzo;

    // protected final String TIPO;
    public Veicolo(String nome, String marca, int cilindrata, int annoProduzione, int prezzo) {
        this.nome = nome;
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.annoProduzione = annoProduzione;
        this.prezzo = prezzo;
    }



    public  abstract TipoVeicolo getTipo();





    public void setPrezzo(int nuovoPrezzo) {
        this.prezzo = nuovoPrezzo;
    }

    public abstract int getNumeroRuote();

}
