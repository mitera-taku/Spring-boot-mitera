// package com.example.springboot.Controller;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// // import ch.qos.logback.core.model.Model;

// @Controller
// @RequestMapping("/each")
// public class eachController {
    
//     @GetMapping("")
//     public String index(Model model){
//         List<String>itemsList= new ArrayList<>();
//         itemsList.add("バナナ");
//         itemsList.add("りんご");
//         itemsList.add("ブドウ");

//         model.addAttribute("itemsList", itemsList);

//         return "each";
//     }
// }
