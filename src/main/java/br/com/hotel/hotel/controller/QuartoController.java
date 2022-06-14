package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuartoController {

    @GetMapping("/administrador/quarto")
    public String quarto(){
        return "quarto";
    }
}
