package com.accenture.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accenture.demo.model.User;

public class CrudController {

	@Autowired
	CrudRepository cRepo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/adduser")
	public String getText(@RequestParam("name") String name, Model model){
	
		User addUser = new User(name);
		
		cRepo.save(addUser);
		
		String result = cRepo.findAll().toString();
		
		model.addAttribute("message",result);
		
		return "home";
		
		
		
	}
	
}
