package br.com.hotel.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaleConoscoController {
    @GetMapping("/index/faleconosco")
    public String faleconosco(){
        return "faleconosco";
    }
}