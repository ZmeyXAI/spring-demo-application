package conspicuum.controllers;

import conspicuum.entity.User;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {


	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String userForm(Model m) {
		m.addAttribute("user", new User());
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String userFormValid(@Valid User user, BindingResult result, Model m/*, RedirectAttributes redirectAttributes*/) {
		if (result.hasErrors()) {
			return "index";
		}
		m.addAttribute("user", user);
		return "second";
//		redirectAttributes.addAttribute("User", user);
//		return "redirect:/second";

	}
}


