package com.luisgomezcaballero.bean;

/*
 *  This class have all the feature for a competitor
 */
public class UserBean {
	private String name;
	private String surname;
	private int score;

	public UserBean(String name, String surname, int score) {
		super();
		this.name = name;
		this.surname = surname;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
