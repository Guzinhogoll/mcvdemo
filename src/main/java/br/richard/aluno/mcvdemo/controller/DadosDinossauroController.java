package br.richard.aluno.mcvdemo.controller;

import br.richard.aluno.mcvdemo.models.Dinossauro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dinossauro")
public class DadosDinossauroController {
    private static final List<Dinossauro> dinossauros = new ArrayList<Dinossauro>();

    public DadosDinossauroController(){
        dinossauros.add(new Dinossauro("Argentinossauro","Herbivoro",10000000,21.0));
        dinossauros.add(new Dinossauro("Pterodáctilo","Carnivoro", 2,2.0));
        dinossauros.add(new Dinossauro("Tricerátops","Herbivoro", 5000000,6.0));
    }
    @GetMapping
    public List<Dinossauro> getDinossauros(){
        return dinossauros;
    }
}
