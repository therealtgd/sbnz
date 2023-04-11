package com.ftn.sbnz.backward.service.controllers;

import com.ftn.sbnz.backward.service.services.ActivateZadatakRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zadatak")
public class ActivateZadatakRulesController {
    private ActivateZadatakRulesService service;

    @Autowired
    public ActivateZadatakRulesController(ActivateZadatakRulesService service) {
        this.service = service;
    }

    @GetMapping("")
    public void fireAllRules() {
        service.fireRules();
    }
}
