package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	// Test case for SAD
	@Test
	public void givenMessage_whenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyseMood("I am Sad");
		String expected = "SAD";
		Assert.assertEquals(expected, actual);

	}

	// Test case for HAPPY
	@Test
	public void givenMessage_whenNotSad_ShouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String actual = moodAnalyzer.analyseMood("I am Happy");
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);

	}

}
