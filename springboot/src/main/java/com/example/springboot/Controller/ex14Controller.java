package com.example.springboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ex14")
public class ex14Controller {

    @GetMapping("")
    public String index(Model model){
        List<String>nameList = new ArrayList<>();
        nameList.add("山田太郎");
        nameList.add("田中太郎");
        nameList.add("佐藤太郎");
        nameList.add("鈴木太郎");
        nameList.add("高橋太郎");

        model.addAttribute("nameList",nameList);


        return "ex14-name";
    }
}
