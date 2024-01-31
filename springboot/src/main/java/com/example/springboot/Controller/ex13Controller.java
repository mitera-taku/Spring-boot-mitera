package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex13")
public class ex13Controller {
    
    @GetMapping("")
    public String index(Model model){
        Member member = new Member();
        member.setName("田中太郎");
        member.setAge("21");

        model.addAttribute("member", member);
        return "ex13-age";
    }
    
}
