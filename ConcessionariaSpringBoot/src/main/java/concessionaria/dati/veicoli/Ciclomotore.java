package concessionaria.dati.veicoli;

import concessionaria.dati.enums.TipoVeicolo;
import concessionaria.dati.enums.EdizioneLimitata;

public class Ciclomotore extends Veicolo {

        public static final TipoVeicolo TIPO = TipoVeicolo.CICLOMOTORE;
        private EdizioneLimitata edizioneLimitata;


    public Ciclomotore(String nome, String marca, int cilindrata, int annoProduzione, int prezzo,
                           EdizioneLimitata edizioneLimitata) {
            super(nome, marca, cilindrata, annoProduzione, prezzo);


            this.edizioneLimitata = edizioneLimitata;
            this.calcolaPrezzo();

        }

        @Override
        public TipoVeicolo getTipo() {
            return TIPO;
        }

        @Override
        public int getNumeroRuote() {
            return 2;
        }



      public EdizioneLimitata edizioneLimitata(){
            return edizioneLimitata;
      }

    private void calcolaPrezzo() {

        if (edizioneLimitata!=EdizioneLimitata.NESSUNA)
            this.setPrezzo((int) Math.round(super.getPrezzo() * 1.25));

    }

}
