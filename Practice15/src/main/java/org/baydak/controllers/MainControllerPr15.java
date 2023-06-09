package org.baydak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerPr15 {
    @GetMapping
    public String homePge() {
        return "index";
    }
}
