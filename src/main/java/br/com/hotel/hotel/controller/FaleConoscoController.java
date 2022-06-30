package br.com.hotel.hotel.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.entities.FaleConosco;
import br.com.hotel.hotel.repositories.FaleConoscoRepositories;

@Controller
public class FaleConoscoController {


    @Autowired private FaleConoscoRepositories repo;

    @GetMapping("/faleConosco")
    public String faleConosco(Model model){
        model.addAttribute("faleConosco", new FaleConosco());
        return "faleConosco";
    }


    @PostMapping("/faleConosco/save")
    public String faleconoscoSalvar(FaleConosco faleConosco, RedirectAttributes ra,@RequestParam("cv") MultipartFile file){

        try {
            faleConosco.setNome(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(faleConosco);
        ra.addFlashAttribute("message", "faleconosco Cadastrado com sucesso");
        return "redirect:/faleConosco";
    }


    @GetMapping("/faleconosco/{faleconosconome}")
    @ResponseBody
    public String exibirImagem(Model model, @PathVariable("faleconosconome") Long faleconosconome){
        FaleConosco faleConosco = repo.getReferenceById(faleconosconome);
        return faleConosco.getNome();
    }


}