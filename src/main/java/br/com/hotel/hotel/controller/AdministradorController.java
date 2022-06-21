package br.com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.entities.Administrador;
import br.com.hotel.hotel.repositories.AdministradorRepositories;


@Controller
public class AdministradorController {
    
    @Autowired private AdministradorRepositories repo;
    private String msg;
    private Administrador administrador;

    @GetMapping("/administrador")
    public String administrador(Model model){
        model.addAttribute("adm", administrador);
        return "administrador";
    }

    @GetMapping("failed_adm")
    public String failedAdm(){
        return "failed_adm";
    }

    @GetMapping("/administrador/form_adm")
    public String administradorFormulario(Model model){
        model.addAttribute("mensagem", msg);
        model.addAttribute("adm", new Administrador());
        model.addAttribute("pageTitle", "Adicionar Novo Administrador");
        return "form_adm";
    }

   @PostMapping("/administrador/save")
    public String administradorSave(Administrador adm, RedirectAttributes ra){
        for(Administrador a : repo.findAll()){
            if(a.getId() >= 1){
                msg = "Sistema já possui Administrador";
                return "redirect:/administrador/form_adm";
            }
        }
        administrador = adm;
        repo.save(adm);
        ra.addFlashAttribute("message", "Administrador Registrado");
        return "redirect:/administrador";
    }
   

}
