package tranquoctuan.SpringLogin.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value= {"/","/homePage"}, method= RequestMethod.GET)
	public String Home(Model model) {
		model.addAttribute("title","welcome");
		model.addAttribute("message","This is welcome page");
		Object objAccount = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(objAccount);
		return "/home";
	}
	
	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public String Login(Model model) {
		model.addAttribute("title","LoginPage");
		return "login";
	}

}
