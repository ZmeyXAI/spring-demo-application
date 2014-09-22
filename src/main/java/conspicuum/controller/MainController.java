package conspicuum.controller;

/*основной контроллер*/

import conspicuum.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/*@Controller - указывает, что этот класс является контроллером
@RequestMapping("/") - указывает, что этот контроль обрабатывает все URL от корня
@RequestMapping(method= RequestMethod.GET) - указывает, что метод обрабатывает метод GET
-----
Данный метод аннотирован с помощью @RequestMapping("/"),
 что означает, что используется URL '/'. 
 Метод возвращает строку redirect:user/list, 
 что приводит к переходу на страницу user/list
*/
@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(value="user/list/id/{id}",method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String userList(Model ui, @PathVariable("id") Long id)
    {
        ui.addAttribute("contacts", "Hellow world. This is contacts"+id.toString());

        return "user/list";
    }

   
   /* Аннотация @ResponseBody означает, что результатом работы метода(возвращаемым значением) является тело ответа.
    @ResponseStatus(HttpStatus.OK) - будет возвращаться HTTP-статус 200 OK.
    @RequestMapping(value="user/list/id/{id}", method=RequestMethod.GET,produces="text/json") - указывает что метод будет вызван при запросе URL user/list/id*//*//*, если метод запроса = GET, а также, что этот метод выдаёт содержимое типа text/json.
    Параметр produces будет сравниваться с заголовком Accept. И если клиент не поддерживает такое содержимое, то данный метод вызван не будет.
    @PathVariable("id") Long id указывает, что в метод необходимо передать параметр id типа Long, который необходимо взять из пути 
   */
	
//	----- for forms
@RequestMapping(value="user/list", method= RequestMethod.GET)
public String userListGet(Model ui)
{
    ui.addAttribute("user", new User());

    return "user/list";
}

@RequestMapping(value="user/list/form", method= RequestMethod.POST)
public String userListPost(User u, BindingResult br,  Model ui)
{
    System.out.println(br.toString());
    System.out.println(u.toString());

    ui.addAttribute("user", u);

    return "user/list";
}
//	---
	
	@RequestMapping(value="user/list/id/{id}", method= RequestMethod.GET,produces="text/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String userListJson(Model ui, @PathVariable("id") Long id)
    {
        return "{id:"+id.toString()+"}";
    }

    @RequestMapping("/")
    public String main(Model ui)
    {
        return "redirect:user/list";
    }
	
}
