package br.com.treinaweb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.demo.dto.DiaristaForm;
import br.com.treinaweb.demo.models.Diarista;
import br.com.treinaweb.demo.repositories.DiaristaRepository;

@Controller
@RequestMapping("/diaristas")
public class DiaristaController {

   @Autowired
   private DiaristaRepository repository;

   @GetMapping
    public ModelAndView listarDiaristas() {
        ModelAndView modelAndView = new ModelAndView("listar-diaristas");
        modelAndView.addObject("diaristas", repository.findAll());
        
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detalhes(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("detalhes-diarista");
        modelAndView.addObject("diarista", repository.findById(id).orElse(null));
        return modelAndView;
    }

    @GetMapping("/novo")
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.addObject("diarista", new DiaristaForm());
        
        return modelAndView;
    }


    @PostMapping("/novo")
    public String salvar(@ModelAttribute("diarista") DiaristaForm diaristaForm) {
        Diarista diarista = new Diarista();
        diarista.setNome(diaristaForm.getNome());
        diarista.setCpf(diaristaForm.getCpf());
        diarista.setTelefone(diaristaForm.getTelefone());
        diarista.setEndereco(diaristaForm.getEndereco());

        repository.save(diarista);

        return "redirect:/diaristas";
    }

}
