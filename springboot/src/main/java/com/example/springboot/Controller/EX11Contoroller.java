// package com.example.springboot.Controller;
// // import org.springframework.beans.factory.annotation.Autowired;
// // // import org.springframework.boot.autoconfigure.jersey.JerseyProperties.Servlet;
// // import org.springframework.stereotype.Controller;
// // import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.PostMapping;
// // import org.springframework.web.bind.annotation.RequestMapping;

// // import jakarta.servlet.ServletContext;
// // // import jakarta.servlet.http.HttpSession;
// // @Controller
// // @RequestMapping("/ex11")
// // public class EX11Contoroller {

// //     @Autowired
// //     private ServletContext application;


// //     @GetMapping("")
// //     public String index() {
// //         return "ex11-input";
// //     }
// //     @PostMapping("/output")
// //     public String output(String name,Integer age,String comment){
// //         application.setAttribute("name", name);
// //         application.setAttribute("age", age);
// //         application.setAttribute("comment",comment);
// //         return "ex11-output";
// //     }

// //     // @PostMapping("/out")
// //     // public String output(String name,String age,String comment) {
// //     //     application.setAttribute("name", name);
// //     //     application.setAttribute("age", age);
// //     //     application.setAttribute("comment", comment);
// //     //     return "ex11-out";
// //     // }

// //     @GetMapping("/out2")
// //     public String output2() {
// //         return "ex11-out2";
// //     }

// //     @GetMapping("/return2")
// //     public String output3() {
// //         return "ex11-out";
// //     }

// // }



// // import javax.servlet.ServletContext;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import jakarta.servlet.ServletContext;

// // import com.example.domain.User;
// // import com.example.form.Ex11ReceiveForm;

// @Controller
// @RequestMapping("/ex11")
// public class EX11Contoroller{

// 	@Autowired

// 	private ServletContext application;



// 	@RequestMapping("")
// 	public String index() {
// 		return "ex-11-input";
// 	}

//     @PostMapping("/input")
//     public String receive(ReceiveForm form){
//         User user = new User();
//         user.setName(form.getName());
//         user.setAge(form.getAge());
//         user.setComment(form.getComment());
//         application.setAttribute("user",user);
//         return "ex11.out";

//     }

// 	// @RequestMapping("/input")
// 	// public String inputs(RecieveForm receiveForm) {
// 	// 	User user = new User();
// 	// 	user.setName(receiveForm.getName());
// 	// 	user.setAge(receiveForm.getIntAge());
// 	// 	user.setComment(receiveForm.getComment());
// 	// 	user.setBirthDay(receiveForm.getLocalDate());
// 	// 	application.setAttribute("user", user);
// 	// 	return "ex-11-output";
// 	// }

// 	@GetMapping("/output2")
// 	public String output2() {
// 		return "ex-11-output2";
// 	}

// 	@GetMapping("/output")
// 	public String output() {
// 		return "ex-11-output";
// 	}

// }

