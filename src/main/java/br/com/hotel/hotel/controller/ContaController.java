package br.com.hotel.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContaController {
    
    @GetMapping("/administrador/conta")
    public String contratar(){
        return "contratar";
    }
}
