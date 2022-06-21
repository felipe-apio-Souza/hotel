package br.com.hotel.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.hotel.hotel.repositories.CafeManhaRepositories;



    @Controller
public class CafeManhaController {
    @Autowired private CafeManhaRepositories repo;
    
    @GetMapping("/funcionario/cafemanha")
    public String quarto(Model model){
        model.addAttribute("listCafe", repo.findAll());
        return "quartos_adm";
    }
}
