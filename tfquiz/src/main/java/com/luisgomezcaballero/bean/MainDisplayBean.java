package com.luisgomezcaballero.bean;

import java.util.ArrayList;

/* This class have all the operation of the game
 * if we choose the option of play and answer all
 * the questions.
*/
public class MainDisplayBean {
	private String user;
	private ArrayList<QuestionBean> nombreArrayList;
	private Boolean btnAnswer;
	private String resultQuestion;
	private int finalScore;

	public MainDisplayBean(String user, ArrayList<QuestionBean> nombreArrayList, Boolean btnAnswer,
			String resultQuestion, int finalScore) {
		super();
		this.user = user;
		this.nombreArrayList = new ArrayList<QuestionBean>();
		this.btnAnswer = btnAnswer;
		this.resultQuestion = resultQuestion;
		this.finalScore = finalScore;
	}

	public Boolean getBtnAnswer() {
		return btnAnswer;
	}

	public void setBtnAnswer(Boolean btnAnswer) {
		this.btnAnswer = btnAnswer;
	}

	public String getResultQuestion() {
		return resultQuestion;
	}

	public void setResultQuestion(String resultQuestion) {
		this.resultQuestion = resultQuestion;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public ArrayList<QuestionBean> getNombreArrayList() {
		return nombreArrayList;
	}

	public void setNombreArrayList(ArrayList<QuestionBean> nombreArrayList) {
		this.nombreArrayList = nombreArrayList;
	}

	public Boolean getButton() {
		return btnAnswer;
	}

	public void setButton(Boolean btnAnswer) {
		this.btnAnswer = btnAnswer;
	}
}
