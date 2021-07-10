package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	/*
	 * This Test Case Excepts Sad Mood
	 */
	@Test
	public void givenMessage_whenSad_ShouldReturn_Sad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String actual = moodAnalyzer.analyseMood();
		String expected = "SAD";
		Assert.assertEquals(expected, actual);

	}

	/*
	 * This Test Case Excepts Happy Mood
	 */
	@Test
	public void givenMessage_whenNotSad_ShouldReturn_Happy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);

	}

	/*
	 * This Test Case Excepts Null Mood
	 */
	@Test
	public void givenNullMood_ShouldReturn_Happy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String actual = moodAnalyzer.analyseMood();
		String expected = "HAPPY";
		Assert.assertEquals(expected, actual);

	}
	/*
	 * This Test Case Will Check For empty and values
	 */

	@Test
	public void givenNullMood_ShouldThrow_Exception() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println("here");
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
	}

}
