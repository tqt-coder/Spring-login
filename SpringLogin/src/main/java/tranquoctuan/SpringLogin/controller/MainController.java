package tranquoctuan.SpringLogin.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value= {"/","/homePage"}, method= RequestMethod.GET)
	public String Home(Model model) {
		model.addAttribute("title","welcome");
		model.addAttribute("message","Welcome you to this web page!!!");
		
		return "/home";
	}
	
	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public String Login(Model model) {
		model.addAttribute("title","LoginPage");
		return "login";
	}
	
	@RequestMapping(value= {"/403"}, method= RequestMethod.GET)
	public String accessDened(Model model, Principal principal) {
		if(principal != null) {
			String message = "Hi "+ principal.getName() + " You not permit access this page!";
			model.addAttribute("message",message);
		}
		
		return "/403page";
	}
	
	@RequestMapping(value={"/admin"}, method= RequestMethod.GET)
	public String adminPage() {
		return "/admin";
	}
	
	@RequestMapping(value= {"/userInfo"}, method= RequestMethod.GET)
	public String userInfo(Model model) {
		model.addAttribute("message", "Welcome you to user page");
		return "/userInfo";
	}
	
	

}
