package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.th.model.Etudiant;

@Controller
public class EtudiantController {
	
@GetMapping("etudiant")
public String students(Model model)
{
Etudiant et=new Etudiant("jack", "maa", 50, "aucune");
model.addAttribute("etudiant", et);
model.addAttribute("message", "bonjour le monde");
return "students";	

}
@GetMapping("myStudent")
public String studentpage(Model m)
{
Etudiant et=new Etudiant();
//et.setAge(20);
m.addAttribute("etudiant", et);
return "StudentForm";

}
@PostMapping("affiche")
public String affichage(@ModelAttribute(name = "etudiant") Etudiant etudiant,Model md)
{
	md.addAttribute("student", etudiant);
return "affiche";	
}
	
	
}
