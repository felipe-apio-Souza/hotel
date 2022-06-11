package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContratarController {

    @GetMapping("/administrador/contratar")
    public String contratar(){
        return "contratar";
    }
}
