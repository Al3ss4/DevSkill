package concessionaria.service;

import concessionaria.dati.enums.*;
import concessionaria.dati.proprietà.Gomme;
import concessionaria.dati.veicoli.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowroomService {

    private List<Veicolo> veicoli;

    public ShowroomService() {
        //Gomme tipologiaGomme1 = new Gomme(TipoGomme.DURE, ProprietàTipoGomme.ASCIUTTE);
        //Gomme tipologiaGomme2 = new Gomme(TipoGomme.MEDIE, ProprietàTipoGomme.BAGNATE);
        //Gomme tipologiaGomme3 = new Gomme(TipoGomme.MORBIDE, ProprietàTipoGomme.ASCIUTTE);
        Veicolo automobile1 = new Automobile("Lancia Y", "Lancia", 1400, 2000, 1500000);
        Veicolo automobile2 = new Automobile("Punto", "Fiat", 1200, 2011, 1700000);
        Veicolo bicicletta1 = new Bicicletta("BMX", "Cube", 50, 2021, 15000);
        Veicolo bicicletta2 = new Bicicletta("BMX", "Cannondale", 60, 2015, 19000);
        Veicolo ciclomotore1 = new Pista("Ciao", "Piaggio", 70, 1995, 15000, EdizioneLimitata.EDIZIONE_LIMITATA, TipoCambio.NORMALE, new Gomme(TipoGomme.DURE, ProprietàTipoGomme.ASCIUTTE));
        Veicolo ciclomotore2 = new Pista("Ciao", "Piaggio", 70, 1995, 15000,EdizioneLimitata.NESSUNA,  TipoCambio.INVERTITO, new Gomme(TipoGomme.MEDIE, ProprietàTipoGomme.BAGNATE));
        Veicolo ciclomotore3 = new Pista("Ciao", "Piaggio", 70, 1995, 15000, EdizioneLimitata.NESSUNA,  TipoCambio.NORMALE, new Gomme(TipoGomme.MORBIDE, ProprietàTipoGomme.ASCIUTTE));
        Veicolo ciclomotore4 = new Ciclomotore("Scarabeo", "Aprilia", 50, 1980, 12000, EdizioneLimitata.EDIZIONE_LIMITATA);
        Veicolo ciclomotore5 = new Ciclomotore("Ciao", "Piaggio", 100, 1997, 18000, EdizioneLimitata.NESSUNA);
        Veicolo triciclo1 = new Triciclo("MP3", "Piaggio ", 100, 2005, 15000);
        Veicolo triciclo2 = new Triciclo("Tricity 300", "Yamaha", 200, 2000, 10000);

        this.veicoli = new ArrayList<>();
        veicoli.add(automobile1);
        veicoli.add(automobile2);
        veicoli.add(bicicletta1);
        veicoli.add(bicicletta2);
        veicoli.add(ciclomotore1);
        veicoli.add(ciclomotore2);
        veicoli.add(ciclomotore3);
        veicoli.add(ciclomotore4);
        veicoli.add(ciclomotore5);
        veicoli.add(triciclo1);
        veicoli.add(triciclo2);
    }

    public Veicolo piuVecchio() {
        Veicolo piuVecchio = veicoli.get(0);

        for (Veicolo v : veicoli) {
            if (v.getAnnoProduzione() < piuVecchio.getAnnoProduzione()) {
                piuVecchio = v;
            }
        }

        return piuVecchio;
    }

    public Veicolo piuNuovo() {
        Veicolo piuNuovo = veicoli.get(0);

        for (Veicolo v : veicoli) {
            if (v.getAnnoProduzione() > piuNuovo.getAnnoProduzione()) {
                piuNuovo = v;
            }
        }

        return piuNuovo;
    }

    public float prezzoMedio() {
        float totalePrezzi = 0;

        for (Veicolo v : veicoli) {
            totalePrezzi += v.getPrezzo();
        }

        return totalePrezzi / veicoli.size();
    }

    public float prezzoMedio(TipoVeicolo tipo) {
        float totalePrezzi = 0;

        for (Veicolo v : veicoli) {
            if (v.getTipo().equals(tipo)) {
                totalePrezzi += v.getPrezzo();
            }
        }

        return totalePrezzi / contaVeicoli(tipo);
    }

    public int totaleRuote() {
        int totaleRuote = 0;

        for (Veicolo v : veicoli) {
            totaleRuote += v.getNumeroRuote();
        }

        return totaleRuote;
    }


    public int contaVeicoli(TipoVeicolo tipo) {
        int totaleVeicoli = 0;

        for (Veicolo v : veicoli) {
            if (v.getTipo().equals(tipo)) {
                totaleVeicoli++;
            }
        }

        return totaleVeicoli;
    }
}
