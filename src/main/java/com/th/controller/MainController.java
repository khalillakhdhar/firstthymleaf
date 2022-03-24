package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
@GetMapping("")
public String welcompage(Model m)
{
	String name="bill gates"; 
	m.addAttribute("nom",name);
return "first";	
}


	
	
	
}
