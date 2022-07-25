package springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springtest.dto.Persona;
import springtest.utility.HTTPUtility;

import java.util.List;

@RestController
public class FirstController {

    @GetMapping(value = HTTPUtility.GET)
   public List<Persona> firstTest(){
        return List.of(
                new Persona ("Leonardo", "Di Caprio", 40),
                new Persona ("Jhonny", "Deep", 45),
                new Persona ("Cameron", "Diaz", 42)
        );
    }
    @PostMapping(value = HTTPUtility.POST)
    public void postTest(@RequestBody Persona persona){
        System.out.println(persona.getNome());
        System.out.println(persona.getCognome());
        System.out.println(persona.getEta());
    }
}
