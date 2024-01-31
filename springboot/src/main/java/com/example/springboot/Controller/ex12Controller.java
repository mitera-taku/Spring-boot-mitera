// package com.example.springboot.Controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/ex12")
// public class ex12Controller {

//     @GetMapping("")
//         public String index(){
//             return "ex12";
//         }
    


//     @GetMapping("/register-member")
//     public String index(Member member2, Model model){//modelを確認する事
//         Member member = new Member();
//         member.setName(member2.getName());
//         member.setAge(member2.getAge());
//         member.setComment(member2.getComment());
//         member.setMoney(member2.getMoney());
//         model.addAttribute("member", member);

//         return "ex12-register-member-output";
//     }
 
// //     @GetMapping("")
// //     public String index(Member member2,Model model){
// //     Member member = new Member();
// //     member2.setName(model.addAttribute("name", member)) ;
// //     member2.setAge((model.addAttribute("age", member)));
// //     member2.setComment((model.addAttribute("commentr", member)));
// //     member2.setMoney((model.addAttribute("money", member)));
// //     model.addAttribute("member" ,member);

// //     return "ex12-register-member-output";
// // }

// }
