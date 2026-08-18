package br.com.treinaweb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.demo.dto.DiaristaForm;
import br.com.treinaweb.demo.models.Diarista;
import br.com.treinaweb.demo.repositories.DiaristaRepository;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private DiaristaRepository repository;

    @RequestMapping(name = "/", method = RequestMethod.GET) 
    public String home(){
        return "home";
    }

    @GetMapping("/modelmap")
    public String home2(ModelMap modelmap){
        modelmap.addAttribute("nome", "TreinaWeb");
        
        return "home";
    }

    @GetMapping("/modelandview")
    public ModelAndView home3(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "roblox");
        
        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("diarista", new DiaristaForm());
        
        return modelAndView;
    }

    @PostMapping("/form")
    public String abrirFormulario(@ModelAttribute("diarista") DiaristaForm diaristaForm) {

        Diarista diarista = new Diarista();
        diarista.setNome(diaristaForm.getNome());
        diarista.setCpf(diaristaForm.getCpf());
        diarista.setTelefone(diaristaForm.getTelefone());

        repository.save(diarista);

        return "redirect:/form";
    }
}