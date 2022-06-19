package br.com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.entities.Administrador;
import br.com.hotel.hotel.services.AdministradorService;


@Controller
public class AdministradorController {
    
    @Autowired private AdministradorService service;

    @GetMapping("/administrador")
    public String administrador(){
        return "administrador";
    }

    @GetMapping("/administrador/form_adm")
    public String administradorFormulario(Model model){
        model.addAttribute("adm", new Administrador());
        model.addAttribute("pageTitle", "Adicionar Novo Administrador");
        return "form_adm";
    }

   @PostMapping("/administrador/save")
    public String administradorSave(Administrador adm, RedirectAttributes ra){
        service.save(adm);
        ra.addFlashAttribute("message", "Administrador Registrado");
        return "redirect:/administrador";
    }
   

}
