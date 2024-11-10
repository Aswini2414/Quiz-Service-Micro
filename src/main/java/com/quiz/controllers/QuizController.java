package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	
//creating the quiz
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		System.out.println(quiz);
		return quizService.add(quiz);
	}
	
	//get all the quizzes
	@GetMapping
	public List<Quiz> get(){
		return quizService.get();
	}
	
	//get one quiz
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id) {
		return quizService.get(id);
	}
}
