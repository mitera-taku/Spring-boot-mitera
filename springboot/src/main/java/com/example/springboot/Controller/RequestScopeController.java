// package com.example.springboot.Controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;



// @Controller
// @RequestMapping("/request-scope")
// public class RequestScopeController {

//     @GetMapping("")
//     public String index(){
//         return "request-scope";
//     }


//     @PostMapping("/input-name")
//     public String inputName(String name,Model model){
//         model.addAttribute("name", name);
//         return "result-request-scope";
//     }
// }
