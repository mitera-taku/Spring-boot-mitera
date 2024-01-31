// package com.example.springboot.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import jakarta.servlet.http.HttpSession;

// @Controller
// @RequestMapping("/exsp")
// public class exsp {

//     @Autowired
//     private HttpSession session;
    
//     @GetMapping("")
//     public String number(){
//         return "exsp";
//     }

//     @PostMapping("/calc")
//     public String calc(String num,String num2,String c){
//         int i = Integer.parseInt(num);
//         int j = Integer.parseInt(num2);
//         if(c.equals("+")){
//             session.setAttribute("result", i+j);
//             return "exsp";

//         }
//     }


    
// }
