package conspicuum.controllers;

import conspicuum.entity.UserDetail;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserDetailController {

	@RequestMapping(value = "/user/UserDetail/{id}", method = RequestMethod.GET)
	public String userDetailForm(Model m, @PathVariable("id") Long id) {
		m.addAttribute("user", new UserDetail(id));
		return "UserDetail";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String userDetailFormValid(@Valid UserDetail user, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "UserDetail";
		}
		m.addAttribute("message", "Successfully saved User!");
		return "redirect:/UserDetail";
	}

}
