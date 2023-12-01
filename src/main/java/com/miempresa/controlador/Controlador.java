package com.miempresa.controlador;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping("/inicio")
    public String inicio(Model model) {
        ClassPathResource resource = new ClassPathResource("src/main/resources/static/index.html");
        model.addAttribute("content", resource.toString());
        return "index";
    }
    @GetMapping("/descarga")
    public String descarga(Model model) {
    	ClassPathResource resource = new ClassPathResource("src/main/resources/templates/App.html");
    	model.addAttribute("content", resource.toString());
    	return "App";
    }
    @GetMapping("/register")
    public String login(Model model) {
    	ClassPathResource resource = new ClassPathResource("src/main/resources/templates/Register.html");
    	model.addAttribute("content", resource.toString());
    	return "Register";
    }
}

