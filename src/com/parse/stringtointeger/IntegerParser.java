package com.parse.stringtointeger;

public class IntegerParser {

	public static int parseInt(String str) {
        int num = 0;
        int sign = 1;
        int i = 0;
        
        // Check for a negative sign
        if (str.charAt(0) == '-') {
            sign = -1;
            i = 1;  // Start parsing after the negative sign
        }

        // Loop through each character of the string
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if the character is a valid digit
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');  // Accumulate the number
            } else {
                throw new IllegalArgumentException("Invalid input: non-numeric character found");
            }
        }
        
        return num * sign;
    }
	
	public static void main(String[] args) {
		String str = "-12345";
        
        try {
            int result = parseInt(str);
            System.out.println("Parsed integer: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

	}

}
