package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiberarQuartosController {

    @GetMapping("/funcionario/liberarQuartos")
    public String liberarQuartos(){
        return "liberarQuartos";
    }
}
