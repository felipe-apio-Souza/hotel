package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {
    
    @GetMapping("/administrador/conta")
    public String conta(){
        return "conta";
    }
}
