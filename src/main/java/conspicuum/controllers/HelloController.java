package conspicuum.controllers;

import conspicuum.entity.User;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
//@RequestMapping(value = "/")
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loadFormPage(Model m) {
		m.addAttribute("user", new User());
		return "hello";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String submitForm(@Valid User user, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "hello";
		}
		m.addAttribute("message", "Successfully saved User!");
		return "redirect:/second";
	}

	@RequestMapping(value = "/second", method = RequestMethod.GET)
	public String showPageWithMessage() {
		return "second";
	}
}

