package com.example.mypackage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myapp")
public class HomeController {

	@Value("${server.port}")
	public static String port;
	
	@RequestMapping("/SpringMVC")
	public String getSpringMVC()
	{
		return port;
	}
	
	@GetMapping("/SpringMVC/next")
	public String getSecPage()
	{
		return "Second Page";
	}
}
