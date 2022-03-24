package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("")
public String saywelcome()
{
	
return "First";	
}
@GetMapping("controls")
public String contorls()
{
return "controllers";	
}
}
