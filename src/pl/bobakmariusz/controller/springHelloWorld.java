package pl.bobakmariusz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class springHelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Spring MVC </h3>This message is coming from springHelloWorld.java </div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
