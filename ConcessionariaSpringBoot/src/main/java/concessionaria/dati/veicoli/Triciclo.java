package concessionaria.dati.veicoli;

import concessionaria.dati.enums.TipoVeicolo;

public class Triciclo extends Veicolo {

    public static final TipoVeicolo TIPO = TipoVeicolo.TRICICLO;

    public Triciclo(String nome, String marca, int cilindrata, int annoProduzione, int prezzo) {
        super(nome, marca, cilindrata, annoProduzione, prezzo);
    }

    @Override
    public TipoVeicolo getTipo() {
        return TIPO;
    }

    @Override
    public int getNumeroRuote() {
        return 3;
    }

}
