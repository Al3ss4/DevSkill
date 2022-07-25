package concessionaria.controller;

import concessionaria.dati.enums.TipoVeicolo;
import concessionaria.dati.veicoli.Veicolo;
import concessionaria.service.ShowroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowroomController {

    @Autowired
    ShowroomService showroomService;

    @GetMapping(value="/piuVecchio")
    public Veicolo piuVecchio() {
        return showroomService.piuVecchio();
    }
    @GetMapping(value="/piuNuovo")
    public Veicolo piuNuovo() {
        return showroomService.piuNuovo();
    }
    @GetMapping(value="/prezzoMedio")
    public float prezzoMedio() {
        return showroomService.prezzoMedio();
    }
    @GetMapping(value="/prezzoMedio/{tipo}")
    public float prezzoMedio(@PathVariable TipoVeicolo tipo) {
        return showroomService.prezzoMedio(tipo);
    }
    @GetMapping(value="/totaleRuote")
    public int totaleRuote() {
        return showroomService.totaleRuote();
    }

    @GetMapping(value="/contaVeicoli/{tipo}")
    public int contaVeicoli(@PathVariable TipoVeicolo tipo) {
        return showroomService.contaVeicoli(tipo);
    }
}
