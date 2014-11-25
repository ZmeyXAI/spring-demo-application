package conspicuum.controllers;

import conspicuum.entity.User;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

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
		return "redirect:/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String userFormValid(@Valid User user, BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "redirect:/index";
		}
		redirectAttributes.addAttribute("User", user);
		return "redirect:/second";

	}


}
