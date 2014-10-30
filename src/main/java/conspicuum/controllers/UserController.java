package conspicuum.controllers;

import conspicuum.entity.User;
import conspicuum.entity.UserDetail;
import org.apache.log4j.Logger;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

import javax.validation.Valid;


@Controller
//@RequestMapping(value = "/")
public class UserController {

	private static final Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String userForm(Model m) {
		m.addAttribute("user", new User());
		return "index";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String userFormValid(@Valid User user, BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "index";
		}
//		Long id;
//		id = user.getId();
		redirectAttributes.addAttribute( "User_id", user.getId());
		redirectAttributes.addAttribute( "User_Login", user.getLogin());
		redirectAttributes.addAttribute( "User_Password", user.getPassword());
		return "redirect:second";
	}

}

