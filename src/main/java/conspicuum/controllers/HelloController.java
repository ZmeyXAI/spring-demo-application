package conspicuum.controllers;

import conspicuum.User.User;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/Valid")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String loadFormPage(Model m) {
		m.addAttribute("user", new User());
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@Valid User user, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "hello";
		}

		m.addAttribute("message", "Successfully saved User!");
		return "hello";
	}

}
