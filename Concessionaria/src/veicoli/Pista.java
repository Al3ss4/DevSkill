package veicoli;


import enums.EdizioneLimitata;
import enums.TipoCambio;
import enums.TipoGomme;
import proprietà.Gomme;
import veicoli.Ciclomotore;

public class Pista extends Ciclomotore {




    private TipoCambio cambio;

    private Gomme gomme;

    public Pista(String nome, String marca, int cilindrata, int annoProduzione, int prezzo, EdizioneLimitata edizioneLimitata, TipoCambio cambio, Gomme tipologiaGomme) {
        super(nome, marca, cilindrata, annoProduzione, prezzo, edizioneLimitata);


        this.cambio= cambio();
        this.gomme = tipologiaGomme;

        this.calcolaPrezzoDaPista();
    }




    public Gomme tipologiaGomme(){
        return gomme;
    }
    public TipoCambio cambio(){
        return cambio;
    }
    private void calcolaPrezzoDaPista() {

            this.setPrezzo((int) Math.round(super.getPrezzo() * 1.15));

    }

}

