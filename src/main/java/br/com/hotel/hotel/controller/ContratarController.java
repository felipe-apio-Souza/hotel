package br.com.hotel.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.repositories.CandidatosRepositories;

@Controller
public class ContratarController {

    @Autowired private CandidatosRepositories candidatosRepo;

    @GetMapping("/administrador/contratar")
    public String contratar(Model model){
        model.addAttribute("listCandidato", candidatosRepo.findAll());
        return "contratar";
    }

    @GetMapping("/administrador/contratar/delete/{cpf}")
    public String deleteUser(@PathVariable("cpf") String cpf,  RedirectAttributes ra){
        candidatosRepo.deleteById(cpf);
        ra.addFlashAttribute("message", "Candidato " + cpf + " foi deletado");
        return "redirect:/administrador/contratar/";

    }

    
    
}
