package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping; // Import the GetMapping annotation
@Controller
@RequestMapping("/ex03")
public class Ex03Controller {

    @GetMapping("/show-image") // Use GetMapping instead of getMapping
    public String index(){
        return "ex-03.html";
    }
}
