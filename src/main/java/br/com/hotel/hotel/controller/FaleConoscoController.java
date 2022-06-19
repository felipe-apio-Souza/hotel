package br.com.hotel.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FaleConoscoController {

    //default
    @RequestMapping("/faleConosco")
    public String index(){
        return "faleConosco";
    }
}
