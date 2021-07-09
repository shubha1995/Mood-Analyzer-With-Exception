package com.moodanalyzer;

public class MoodAnalyzer {

	private String message; // define variable

	public MoodAnalyzer() { // define default constructor

	}

	public MoodAnalyzer(String message) { // define parameterized constructor
		this.message = message;
	}

	public String analyseMood() {

		if (message.toLowerCase().contains("sad"))
			return "SAD";
		return "HAPPY";

	}
}
