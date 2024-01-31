// package com.example.springboot.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// // import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import jakarta.servlet.http.HttpSession;

// @Controller
// @RequestMapping("/ex09")
// public class ex09controller {



//     @GetMapping("")
//             public String index(){
//                 return "ex09";
//             }
    
    
//         @PostMapping("/login")
//             public String index2(ReceiveForm receiveForm, Model model){
//                 // model.addAttribute("name", name);
//                 if("abc@gmail.com".equals(model.getEmail())&&"abc".equals(model.getPass())){
//                     // name = "成功";
//                     model.addAttribute("result", "成功");
//                     return "ex09-success";
//                 }
//                 else{
//                     model.addAttribute("result", "失敗");
//                     // name = "失敗";
//                     return "ex09-false";
//                 }
//             }
//         }

//     //     @ModelAttribute
//     //     public Ex09ReceiveForm setUpForm() {
//     //         return new Ex09ReceiveForm();
//     //     }
    
//     //     @RequestMapping("")
//     //     public String index() {
//     //         return "ex-09";
//     //     }
    
//     //     @RequestMapping("/receive-info")
//     //     public String receiveInfo(Ex09ReceiveForm receiveForm, Model model) {
//     //         if ("abc@gmail.com".equals(receiveForm.getEmail()) && "abc".equals(receiveForm.getPass())) {
//     //             model.addAttribute("result", "成功");
//     //         } else {
//     //             model.addAttribute("result", "失敗");
//     //         }
//     //         return "ex-09-result";
//     //     }
    
//     // }
    



