package com.billoscu.joke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billoscu.joke.services.JokeService;
import com.billoscu.joke.services.JokeServiceImpl;

@Controller
public class JokeController {

	//private JokeService jokeService;
	@Autowired
	private JokeServiceImpl jokeServiceImpl;

	/*
	@Autowired
	public JokeController(JokeService jokeService) {
	this.jokeService = jokeService;	
	}*/
	
	public JokeController(JokeServiceImpl jokeServiceImpl) {
		this.jokeServiceImpl = jokeServiceImpl;	
		}
	
	@RequestMapping({"/",""})
	public String showJokes(Model model) {
		model.addAttribute("joke",jokeServiceImpl.getJoke());
		return "chucknorris"; // name of thymeleaf view chucknorrys.html
	}

}
