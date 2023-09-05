package com.naresh;

public class ValidationUtil {

	public static boolean isValid(String input) {
		return input != null && "".equals(input.trim());
	}
	
}
