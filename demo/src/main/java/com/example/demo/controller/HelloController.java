package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/index")
    public String index() {
        return "redirect:/hello/index2";//リダイレクトでindex2へ飛ばしている
    }

    @GetMapping("/index2")
    public String index2() {
        return "hello-world";//templates/hello-world.htmlと一緒にする必要がある
    }
}
