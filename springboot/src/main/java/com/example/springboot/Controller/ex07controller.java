// package com.example.springboot.Controller;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/ex07")
// public class ex07controller {

//     @GetMapping("")
//     public String index(ReceiveForm receiveForm){
//         return "ex07";
//     }

//     @PostMapping("/clc")
//     public String receiveHobby(String num1,String num2){
//         int i = Integer.parseInt(num1);
//         int j = Integer.parseInt(num2);
//         System.out.println(i*j);
//         return "finished";
//     }


//     @RequestMapping("/calc")
// 	public String calc(Ex07ReceiveForm recieveForm) {
// 		System.out.println(recieveForm.getNum1() * recieveForm.getNum2());
// 		return "finished";
// 	}
// }
