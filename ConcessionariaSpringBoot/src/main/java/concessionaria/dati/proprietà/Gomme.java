package concessionaria.dati.proprietà;

import concessionaria.dati.enums.ProprietàTipoGomme;
import concessionaria.dati.enums.TipoGomme;

public class Gomme {

    private TipoGomme tipoGomme;
    private ProprietàTipoGomme proprietàGomme;

    public Gomme(TipoGomme tipoGomme, ProprietàTipoGomme proprietàGomme) {
        this.tipoGomme = tipoGomme;
        this.proprietàGomme = proprietàGomme;
    }

    public TipoGomme getTipoGomme(){
        return tipoGomme;
    }

    public ProprietàTipoGomme getProprietàTipoGomme(){
        return proprietàGomme;
    }


}
