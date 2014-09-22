package conspicuum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
	Аннотоация @Controller необходима для того чтобы Spring знал, 
что данный класс является bean’ом, и его  необходимо подгрузить 
при старте приложения.
	Аннотоация @RequestMapping(“/”) означает, что все методы 
	будут получать запросы с URI, который будет начинаться 
	строкой “/”. Чтобы метод welcome получал управление, 
	необходимо выполнить запрос вида “/welcome”.
*/


@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}
