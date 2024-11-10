package com.quiz.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/quiz-test")
public class TestController {

	@GetMapping
	public String quizTest() {
		return "This is quiz test controller";
	}
}
