package com.luisgomezcaballero.bean;

/* This class have all the operation of the program
*  here we can select what we are going to do, choose
*  to read the instructions of the program, see the 
*  maximum points of the program or we can play the 
*  game and answer all the questions.
*/
public class MainMenuBean {
	private String heading;
	private Boolean btnPlay;
	private Boolean btnInstructions;
	private Boolean btnMaximumPoints;
	private Boolean btnExit;
	
	public MainMenuBean(String heading, Boolean bntPlay, Boolean bntInstructions, Boolean bntMaximumPoints, Boolean btnExit) {
		super();
		// template
		this.heading = "This game is based in answer all the right questions you can. /n"
					 + "You can select diferent options: /n"
					 + "1. - Instructions /n"
					 + "2. - Play /n"
					 + "3. - Maximum Scores /n"
					 + "4. - Exit";
		this.btnPlay = bntPlay;
		this.btnInstructions = bntInstructions;
		this.btnMaximumPoints = bntMaximumPoints;
		this.btnExit = btnExit;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public Boolean getBntPlay() {
		return btnPlay;
	}

	public void setBntPlay(Boolean bntPlay) {
		this.btnPlay = bntPlay;
	}

	public Boolean getBntInstructions() {
		return btnInstructions;
	}

	public void setBntInstructions(Boolean bntInstructions) {
		this.btnInstructions = bntInstructions;
	}

	public Boolean getBntMaximumPoints() {
		return btnMaximumPoints;
	}

	public void setBntMaximumPoints(Boolean bntMaximumPoints) {
		this.btnMaximumPoints = bntMaximumPoints;
	}

	public Boolean getBntExit() {
		return btnExit;
	}

	public void setBntExit(Boolean bntExit) {
		this.btnExit = bntExit;
	}
}
