package com.example.springboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex15")
public class ex15Controller {
    
    @GetMapping("")
    public String index(Model model){
        List<List<String>>teamList = new ArrayList<>();
        List<String> titleList =new ArrayList<>();
        titleList.add("チーム名");
        titleList.add("先鋒");
        titleList.add("中堅");
        titleList.add("大将");
        teamList.add(titleList);
        //Aチームメンバー
        List<String> memberListA = new ArrayList<>();
        memberListA.add("Aチーム");
        memberListA.add("田中");
        memberListA.add("佐藤");
        memberListA.add("鈴木");
        teamList.add(memberListA);
        //Bチームメンバー
        List<String>memberListB = new ArrayList<>();
        memberListB.add("Bチーム");
        memberListB.add("宇賀");
        memberListB.add("伊賀");
        memberListB.add("江賀");
        teamList.add(memberListB);

        //Cチームメンバー
        List<String>memberListC = new ArrayList<>();
        memberListC.add("Cチーム");
        memberListC.add("幸");
        memberListC.add("横山");
        memberListC.add("山本");
        teamList.add(memberListC);

        model.addAttribute("teamList", teamList);

        return "ex15table";
    }
}
