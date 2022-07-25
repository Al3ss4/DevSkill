package concessionaria;

import enums.TipoGomme;
import enums.TipoVeicolo;

public class Main {

    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        System.out.println(showroom.piuVecchio().getNome());
        System.out.println(showroom.piuNuovo().getNome());
        System.out.println(showroom.prezzoMedio());
        System.out.println(showroom.prezzoMedio(TipoVeicolo.AUTOMOBILE));
        System.out.println(showroom.prezzoMedio(TipoVeicolo.CICLOMOTORE));
        System.out.println(showroom.prezzoMedio(TipoVeicolo.BICICLETTA));
        System.out.println(showroom.prezzoMedio(TipoVeicolo.TRICICLO));

    }

}
