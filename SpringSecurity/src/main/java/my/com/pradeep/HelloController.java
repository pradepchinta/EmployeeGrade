package my.com.pradeep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap Model){
		Model.addAttribute("MESSAGE","FIRST SPRING SECURITY");
		return "hello";
		
	}

}
