// package com.example.springboot.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// // import ch.qos.logback.core.model.Model;
// import jakarta.servlet.http.HttpSession;

// @Controller
// @RequestMapping("/ex10")
// public class EX10Contoroller {

//     @Autowired
//     private HttpSession session;

//     @GetMapping("")
//     public String index(){
//         return "ex10-input";
//     }
    
//     @PostMapping("/output")
//     public String output(ReceiveForm form){
//       User user = new User();
//       user.setName(form.getName());
//       user.setAge(form.getAge());
//       user.setComment(form.getComment());
//       session.setAttribute("user",user);
//       return "ex10-output";

//     }
//    //  @PostMapping("/output")
//    //  public String output(ReceiveForm form){
//    //    User user =new User();
//    //    user.setName(form.getName());
//    //    user.setName(form.getAge());
//    //    user.setComment(form.getComment());
//    //    session.getAttribute("user");
//    //    return "ex10-output";
      


//    //  }

//      @GetMapping("/output2")
//      public String output2(){
//         return "ex10-output2";
//      }

//      @GetMapping("/return")
//      public String output3(){
//         return "ex10-output";
//      }

// }


// // package com.example.controller;

// // import javax.servlet.http.HttpSession;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.stereotype.Controller;
// // import org.springframework.web.bind.annotation.ModelAttribute;
// // import org.springframework.web.bind.annotation.RequestMapping;

// // import com.example.domain.User;
// // import com.example.form.Ex10ReceiveForm;

// // @Controller
// // @RequestMapping("/ex10")
// // public class Ex10Controller {

// // 	@Autowired
// // 	private HttpSession session;


// // 	@RequestMapping("")
// // 	public String index() {
// // 		return "ex-10-input";
// // 	}


// // @RequestMapping("/input")
// // public String inputs(Ex10ReceiveForm receiveForm){
// //    User user = new User();
// //    user.setName(receiveForm.setName());
// //    user.setAge(receiveForm.setAge());
// //    user.setComment(receiveForm.setComment());
// //    session.setAttribute("user", user);
// //    return "ex10-10-output";
// // }
// // 	@RequestMapping("/input")
// // 	public String inputs(Ex10ReceiveForm receiveForm) {
		
// // 		User user = new User();
// // 		user.setName(receiveForm.getName());
// // 		user.setAge(receiveForm.getIntAge());
// // 		user.setComment(receiveForm.getComment());
// // 		user.setBirthDay(receiveForm.getLocalDate());
		
// // 		session.setAttribute("user", user);
		
// // 		return "ex-10-output";
// // 	}

// // 	@RequestMapping("/output2")
// // 	public String output2() {
// // 		return "ex-10-output2";
// // 	}

// // 	@RequestMapping("/output")
// // 	public String output() {
// // 		return "ex-10-output";
// // 	}

// // }



















// //     @Autowired
// //     private HttpSession session;

// //     @GetMapping("")
// //     public String index(User user) {
// //         return "ex10-input";
// //     }

// //     @PostMapping("/output")
// //     public String output(String name,Integer age,String comment) {
// //         session.setAttribute("name", name);
// //         session.setAttribute("age", age);
// //         session.setAttribute("comment", comment);
// //         return "ex10-output";
// //     }

// //     @GetMapping("/output2")
// //     public String output2() {
// //         return "ex10-output2";
// //     }

// //     @GetMapping("/return")
// //     public String output3() {
// //         return "ex10-output";
// //     }

// // }
