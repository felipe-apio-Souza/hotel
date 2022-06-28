package br.com.hotel.hotel.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.hotel.hotel.entities.Hospedagem;
import br.com.hotel.hotel.entities.Hospede;
import br.com.hotel.hotel.repositories.HospedagemRepositories;
import br.com.hotel.hotel.repositories.HospedeRepositories;
import br.com.hotel.hotel.repositories.QuartoRepositories;

@Controller
public class HospedagemController {
    
    @Autowired private HospedagemRepositories repo;
    @Autowired private HospedeRepositories repoHospede;
    @Autowired private QuartoRepositories repoQuarto;

    @GetMapping("/quarto/reservar/{quartoid}")
    public String reservar(@PathVariable("quartoid") Long id, Model model){
        model.addAttribute("hospedagem", new Hospedagem());
        model.addAttribute("quarto", repoQuarto.getOne(id));
        model.addAttribute("hospede", new Hospede());
        return "hospedar";
    }

    @PostMapping("/quarto/save/{quartoid}")
    public String hospedar(@PathVariable("quartoid") Long id, Hospede hospede, @RequestParam("inicio") String inicio, @RequestParam("fim") String fim) throws ParseException{

        
    /*
        try {
            Date inicioDate = formatter.parse(inicio);
            Date fimDate = formatter.parse(fim);
            hospede.setInicioHospedagem(inicioDate);
            hospede.setFimHospedagem(fimDate);
            long dias = fimDate.getTime() - inicioDate.getTime();
            hospede.setCustoHospedagem(dias * repoQuarto.getOne(id).getPrecoDiaria());

            repoHospede.save(hospede);
            repoQuarto.getOne(id).setDisponibilidade(false);
            Hospedagem hospedagem = new Hospedagem();
            hospedagem.setCpfHospede(hospede.getCpf());
            hospedagem.setIdQuarto(id);
            repo.save(hospedagem);
        
        return "redirect:/";
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "redirect:/quarto/{quartoid}";
        }
         */
        
        //hospede.setCustoHospedagem(dias * repoQuarto.getOne(id).getPrecoDiaria());

        repoHospede.save(hospede);
        repoQuarto.getOne(id).setDisponibilidade(false);
        Hospedagem hospedagem = new Hospedagem();
        hospedagem.setCpfHospede(hospede.getCpf());
        hospedagem.setIdQuarto(id);
        repo.save(hospedagem);
        return "redirect:/quarto/{quartoid}";
    }
}
