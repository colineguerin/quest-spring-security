package com.wcs.springQuestSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    @ResponseBody
    public String assemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    @ResponseBody
    public String showBases() {
        return "Secret bases: Bordeaux, Lyon, Nantes, Lille, Paris, Toulouse";
    }
}
