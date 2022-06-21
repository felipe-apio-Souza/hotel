package br.com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import br.com.hotel.hotel.entities.Hospede;
import br.com.hotel.hotel.repositories.HistoricoCustosRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoricoCustosController {
    @Autowired private HistoricoCustosRepositories repo;


    @GetMapping("/hospede/historico")
    public String historico(Model model, Hospede hospede){
        //model.addAttribute("listHistorico", repo.find(hospede.getId()));
        return "historicoCustos";
    }

}
