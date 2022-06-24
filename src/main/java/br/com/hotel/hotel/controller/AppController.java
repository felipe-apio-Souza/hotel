package br.com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.hotel.hotel.repositories.QuartoRepositories;

@Controller
public class AppController {
    
    @Autowired private QuartoRepositories repo;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("listQuarto", repo.findAll());
        return "index";
    }

}
