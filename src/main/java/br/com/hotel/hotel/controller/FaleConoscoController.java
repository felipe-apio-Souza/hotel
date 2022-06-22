package br.com.hotel.hotel.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.entities.Candidatos;
import br.com.hotel.hotel.repositories.CandidatosRepositories;

@Controller
public class FaleConoscoController {

    @Autowired private CandidatosRepositories repo;

    @GetMapping("/faleConosco")
    public String faleConosco(Model model){
        model.addAttribute("candidato", new Candidatos());
        return "faleConosco";
    }

    @PostMapping("/faleConosco/save")
    public String candidatoSalvar(Candidatos candidato, RedirectAttributes ra,@RequestParam("cv") MultipartFile file){
        try {
            candidato.setCurriculo(file.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        repo.save(candidato);
        ra.addFlashAttribute("message", "Candidato Cadastrado com sucesso");
        return "redirect:/faleConosco";
    }
}
