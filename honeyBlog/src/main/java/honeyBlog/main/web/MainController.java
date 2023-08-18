package honeyBlog.main.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@RestController
public class MainController {
	
	@RequestMapping("/main")
	public String main(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
		
		return "test";
	}
}
