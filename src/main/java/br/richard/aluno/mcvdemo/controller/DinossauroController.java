package br.richard.aluno.mcvdemo.controller;

import br.richard.aluno.mcvdemo.models.Dinossauro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dinossauro")
public class DinossauroController {

    private static final List<Dinossauro> dinossauros = new ArrayList<Dinossauro>();

    public DinossauroController(){
        dinossauros.add(new Dinossauro("T-Rex","Carnivoro",8000,15.0));
        dinossauros.add(new Dinossauro("Velociraptor","Carnivoro", 50,0.60));
        dinossauros.add(new Dinossauro("Bromtossauros","Herbivoro", 40000,24.0));
    }
@GetMapping
    public  String getDinossauros(Model model){
        model.addAttribute("dinossauros", dinossauros);
        return "dinossauros";
 }
}
