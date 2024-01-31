package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

    @GetMapping("/show-name")
    public String index() {
        return "redirect:/ex02/kana-name";
    }
    @GetMapping("/kana-name")
        public String index2() {
            return "ex-02";
        }
}

