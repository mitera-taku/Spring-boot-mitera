// package com.example.springboot.Controller.houseController;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping; // Import the necessary package
// import org.springframework.web.bind.annotation.RequestMapping;

// import jakarta.servlet.ServletContext;
// @Controller
// @RequestMapping("/application-scope") // Add the missing annotation
// public class ApplicationScopeController {

//     @Autowired
//     private ServletContext application;

//     @GetMapping("")
//     public String count(){
//         Integer count =(Integer)application.getAttribute("count");
//         if(count ==null){
//             count = 0;
//         }
//         count++;
//         application.setAttribute("count", count);
//         return "result-application-scope";
//     }
    
// }
