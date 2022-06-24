package br.com.hotel.hotel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.hotel.hotel.repositories.CafeManhaRepositories;
import br.com.hotel.hotel.entities.CafeManha;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;





@Controller
public class CafeManhaController {
    @Autowired private CafeManhaRepositories repo;
    
    @GetMapping("/funcionario/cafemanha")
    public String cafemanha(Model model){
        model.addAttribute("listCafe", repo.findAll());
     return "cafemanha";
    }

    @PostMapping("/funcionario/cafemanha/save")
    public String cafemanhasave(CafeManha cf){
        repo.save(cf);
        return "redirect:/funcionario/cafemanha";
    }

    @GetMapping("/funcionario/cafeManha/novo")
    public String cafemanha_new(Model model){
        model.addAttribute("cafemanha",new CafeManha ());

        return "cafemanhaNew";
    }

    @GetMapping("/funcionario/cafemanha/delete/{cafeid}")
    public String cafemanha_delete(@PathVariable("cafeid") Long id,  RedirectAttributes ra){
        repo.deleteById(id);
        ra.addFlashAttribute("message", "O café ID " + id + " foi deletado");
        return "redirect:/funcionario/cafemanha";

    }

    @GetMapping("/funcionario/cafemanha/edit/{cafeid}")
    public String cafemanha_edit(@PathVariable("cafeid") Long id,   Model model, RedirectAttributes ra){
        Optional<CafeManha> cf = repo.findById(id);
        model.addAttribute("cafemanha", cf);
        model.addAttribute("pageTitle", "Editar Café (ID: " + id + ")");
        return "cafemanhaNew";

    }

    @GetMapping("/cliente/cafemanha")
    public String cafemanhaCliente (Model model){
        model.addAttribute("listcafe", repo.findAll());
        return "cafemanhaCliente";
    }

}
