package br.com.hotel.hotel.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.hotel.hotel.repositories.CafeManhaRepositories;
import br.com.hotel.hotel.entities.CafeManha;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;





    @Controller
public class CafeManhaController {
    @Autowired private CafeManhaRepositories repo;
    
    @GetMapping("/funcionario/cafemanha")
    public String cafemanha(Model model){
        model.addAttribute("listCafe", repo.findAll());


        return "cafemanha";
    }
    @PostMapping("/funcionario/cafemanha/save")
    public String cafemanhasave(CafeManha cf, @RequestParam("inicio") String inicio, @RequestParam("fim") String fim){
      
        repo.save(cf);
        return "redirect:/funcionario/cafemanha";
    }
    @GetMapping("/funcionario/cafeManha/novo")
    public String cafemanha_new(Model model){

        model.addAttribute("cafemanha",new CafeManha ());

        return "cafemanhaNew";
    }
}
