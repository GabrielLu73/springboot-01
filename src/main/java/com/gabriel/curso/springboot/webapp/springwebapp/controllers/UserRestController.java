package com.gabriel.curso.springboot.webapp.springwebapp.controllers;

import com.gabriel.curso.springboot.webapp.springwebapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController // => @Controller + @ResponseBody
@RequestMapping("/api")
public class UserRestController {

    //@RequestMapping(path = "details", method = RequestMethod.GET)
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Gabriel","Luque");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World Spring Boot");
        body.put("user", user);
        return body;
    }
}
