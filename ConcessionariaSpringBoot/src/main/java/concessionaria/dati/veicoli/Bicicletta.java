package concessionaria.dati.veicoli;

import concessionaria.dati.enums.TipoVeicolo;

public class Bicicletta extends Veicolo {

    public static final TipoVeicolo TIPO = TipoVeicolo.BICICLETTA;

    public Bicicletta(String nome, String marca, int cilindrata, int annoProduzione, int prezzo) {
        super(nome, marca, cilindrata, annoProduzione, prezzo);
    }

    @Override
    public TipoVeicolo getTipo() {
        return TIPO;
    }

    @Override
    public int getNumeroRuote() {
        return 2;
    }

}
