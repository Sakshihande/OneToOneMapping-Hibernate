package com.map.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import javassist.bytecode.analysis.Analyzer;

@Entity

public class Question {
	@Id
	private int questionID;
	private String questionName;
	
	@OneToOne
	@JoinColumn(name="ans_Id")
	private Answer answer;

	public Question(int questionID, String questionName, Answer answer) {
		super();
		this.questionID = questionID;
		this.questionName = questionName;
		this.answer = answer;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
