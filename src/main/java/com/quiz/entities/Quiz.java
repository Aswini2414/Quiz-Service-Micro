package com.quiz.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
*/
@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String title;
	transient private List<Question> questions;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + "]";
	}
	public Quiz(Long id, String title, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
