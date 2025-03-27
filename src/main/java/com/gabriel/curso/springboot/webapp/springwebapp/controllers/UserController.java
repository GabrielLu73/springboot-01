package com.gabriel.curso.springboot.webapp.springwebapp.controllers;

import com.gabriel.curso.springboot.webapp.springwebapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Gabriel","Luque");
        model.addAttribute("title", "Hello World Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }
    /*public String details(Map<String, Object> model) {
        model.put("title", "Hello World Spring Boot");
        model.put("name", "Gabriel");
        model.put("lastname", "Luque");

        return "details";
    }*/

}
