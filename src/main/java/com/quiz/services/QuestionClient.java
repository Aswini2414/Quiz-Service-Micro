package com.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entities.Question;


@FeignClient(url="http://localhost:8082/",value="Question-Client")
public interface QuestionClient {
	
	@GetMapping("/question/quiz/{quizId}")
	public  List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
