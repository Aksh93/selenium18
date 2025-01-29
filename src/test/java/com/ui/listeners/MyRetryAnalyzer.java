package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer  {

	private static final int max_number_of_attempts = 2;
	private static int current_attempt = 1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(current_attempt<=max_number_of_attempts) {
			current_attempt++;
			return true;
		}
		
		return false;
	}

	
	
	
	
}
