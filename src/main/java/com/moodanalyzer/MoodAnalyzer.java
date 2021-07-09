package com.moodanalyzer;

public class MoodAnalyzer {

	private String message; // define variable

	public MoodAnalyzer() { // define default constructor

	}

	public MoodAnalyzer(String message) { // define parameterized constructor
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}

	}
}
