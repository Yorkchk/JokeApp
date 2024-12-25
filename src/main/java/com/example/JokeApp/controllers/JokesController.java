package com.example.JokeApp.controllers;

import com.example.JokeApp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    @Autowired
    private JokesService jokesService;

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "JokePage";
    }
}
