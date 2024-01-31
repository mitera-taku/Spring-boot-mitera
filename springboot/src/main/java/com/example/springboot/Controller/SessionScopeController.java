// package com.example.springboot.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// import org.springframework.web.bind.annotation.PostMapping;

// import jakarta.servlet.http.HttpSession;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/session-scope")
// public class SessionScopeController {
//     @Autowired
//     private HttpSession session;

//     @GetMapping("")
//     public String index() {
//         return "session-scope-form";
//     }

//     @PostMapping("/input-name")
//     public String inputName(String name) {
//         session.setAttribute("name", name);
//         return "result-session-scope1";
//     }

//     @GetMapping("/to-page1")
//     public String toPage1() {
//         return "result-session-scope1";
//     }

//     @GetMapping("/to-page2")
//     public String toPage2() {
//         return "result-session-scope2";
//     }
//     @GetMapping("/to-page3")
//     public String toPage3() {
//         return "result-session-scope3";
//     }
// }
