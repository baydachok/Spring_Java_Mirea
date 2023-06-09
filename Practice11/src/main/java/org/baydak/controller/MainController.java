package org.baydak.controller;


import org.baydak.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage(Model model, @RequestParam(name = "name", required = false, defaultValue = "Юзер") String name) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/student-info")
    @ResponseBody
    public Student getStudentInfo() {
        return new Student("Danila", "Baydak", 19, "IKBO-01-21");
    }
}
