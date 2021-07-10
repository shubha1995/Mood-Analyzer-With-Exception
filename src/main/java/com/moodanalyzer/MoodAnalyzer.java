package com.moodanalyzer;

public class MoodAnalyzer {

	private String message; // define variable

	public MoodAnalyzer() { // define default constructor

	}

	public MoodAnalyzer(String message) { // define parameterized constructor
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message == "")
				throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_EMPTY);
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.ENTERED_NULL);
		}
	}

}
