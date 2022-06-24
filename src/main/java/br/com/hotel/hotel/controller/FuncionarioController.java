package br.com.hotel.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {

    @GetMapping("/funcionario")
    public String funcionario(){
        return "funcionario";
    }
}
