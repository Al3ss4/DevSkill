package concessionaria.dati.veicoli;

import concessionaria.dati.enums.TipoVeicolo;

import java.time.LocalDate;

public class Automobile extends Veicolo {

    public static final TipoVeicolo TIPO = TipoVeicolo.AUTOMOBILE;

    public Automobile(String nome, String marca, int cilindrata, int annoProduzione, int prezzo) {
        super(nome, marca, cilindrata, annoProduzione, prezzo);
        this.calcolaPrezzo();
    }


    @Override
    public TipoVeicolo getTipo() {
        return TIPO;
    }

    @Override
    public int getNumeroRuote() {
        return 4;
    }


   private void calcolaPrezzo() {

       LocalDate oggi = LocalDate.now();
       LocalDate dataVecchio = oggi.minusYears(10);

       if (getAnnoProduzione() < dataVecchio.getYear()) {
           this.setPrezzo((int) Math.round(super.getPrezzo() * 0.90));

       }
   }

}
