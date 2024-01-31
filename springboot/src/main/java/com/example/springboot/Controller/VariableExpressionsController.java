// package com.example.springboot.Controller;

// // import javax.smartcardio.Card;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/variable-expression")
// public class VariableExpressionsController {
    
//     @GetMapping("")
//     public String index(Model model){
//         model.addAttribute("name" ,"<script>alert('クロスサイトスクリプティング')</script>");

//         Car car = new Car();
//         car.setSpeed(100);
//         model.addAttribute("car",car);

//         return "variable-expression";
//     }

//     // public void run(){
//     //     // gas = gas - speed;
//     // }

    
// }
