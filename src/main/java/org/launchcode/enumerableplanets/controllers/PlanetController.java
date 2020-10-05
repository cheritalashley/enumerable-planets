package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }

    @GetMapping("details")
    public String displayPlanetInfo(Model model) {
        model.addAttribute("planets", Planets.values());
        return "planetDetails";
    }
}
