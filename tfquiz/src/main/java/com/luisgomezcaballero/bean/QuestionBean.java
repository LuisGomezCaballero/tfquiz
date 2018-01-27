package com.luisgomezcaballero.bean;

/*
 *  This class have the features for a question
 */
public class QuestionBean {
	private String heading;
	private boolean rightAnswer;

	public QuestionBean(String heading, boolean rightAnswer) {
		super();
		this.heading = heading;
		this.rightAnswer = rightAnswer;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public boolean isRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(boolean rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}
