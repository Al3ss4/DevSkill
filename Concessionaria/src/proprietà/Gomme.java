package proprietà;

import enums.ProprietàTipoGomme;
import enums.TipoGomme;

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
