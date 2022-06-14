package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidatosController {

    @GetMapping("/index/candidatos")
    public String candidatos(){
        return "candidatos";
    }

}