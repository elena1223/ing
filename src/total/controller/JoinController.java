package total.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import total.service.GreetService;

@Controller
public class JoinController {
	@Autowired
	GreetService greetService;
//	@RequestMapping("/join")
//	public String joinHandle(Model model, @RequestParam("id") String id,
//			@RequestParam("email") String email, @RequestParam("password") String password ) {
//		model.addAttribute("id", id);
//		model.addAttribute("email", email );
//		model.addAttribute("password", password);
//		return "join";
//	}
	
	@RequestMapping("/join")
	public String joinHandle(Model model) {
		model.addAttribute("ment", greetService.make());
		return "join";
	}
	
	@RequestMapping("/login")
	public String loginHandle(Model model) {
		model.addAttribute("ment", greetService.make());
		return "login";
	}
}
