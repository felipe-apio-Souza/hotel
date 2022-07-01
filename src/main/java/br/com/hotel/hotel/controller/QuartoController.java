package br.com.hotel.hotel.controller;


import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.hotel.hotel.entities.Quarto;
import br.com.hotel.hotel.repositories.QuartoRepositories;

@Controller
public class QuartoController {

    @Autowired private QuartoRepositories repo;

    @GetMapping("/administrador/quartos")
    public String quarto(Model model){
        model.addAttribute("listQuarto", repo.findAll());
        return "quartos_adm";
    }

    @GetMapping("/administrador/quartos/novo")
    public String quartoNovo(Model model){
        model.addAttribute("quarto", new Quarto());
        return "quartos_novo";
    }

    @PostMapping("/administrador/quartos/novo/save")
    public String quartoSalvar(Optional<Quarto> quarto,RedirectAttributes ra,@RequestParam("imagemQuarto") MultipartFile file){
        System.out.println("Quarto Nome: " + quarto.get().getTitulo());
        for(Quarto q : repo.findAll()){
            if(q.getTitulo().equals(quarto.get().getTitulo())){
                quarto.get().setId(q.getId());
            }
        }
        System.out.println("Quarto Id: " + quarto.get().getId());
        try {
            quarto.get().setImagem(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        quarto.get().setDisponibilidade(true);
        quarto.get().setLimpeza(false);
        repo.save(quarto.get());
        ra.addFlashAttribute("message", "Quarto Cadastrado com sucesso");
        return "redirect:/administrador/quartos";
    }

    @GetMapping("/imagem/{quartoid}")
    @ResponseBody
    public byte[] exibirImagem(Model model, @PathVariable("quartoid") Long idquarto){
        Quarto quarto = repo.getReferenceById(idquarto);
        return quarto.getImagem();
    }

    @GetMapping("/quarto/{quartoid}")
    public String quartoPage(@PathVariable("quartoid") Long id, Model model, RedirectAttributes ra){
        model.addAttribute("quarto", repo.getOne(id));
        return "quartoClient";

    }

    @GetMapping("/administrador/quartos/delete/{quartoid}")
    public String quartoDelete(@PathVariable("quartoid") Long id){
        repo.deleteById(id);
        return "redirect:/administrador/quartos";
    }

    @GetMapping("administrador/quartos/edit/{quartoid}")
    public String quartoEdit(@PathVariable("quartoid") Long id, Model model){
        Optional<Quarto> quarto = repo.findById(id);
        model.addAttribute("quarto", quarto.get());
        return "quartos_novo";
    }

}
