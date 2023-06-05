package com.itbulls.poorna.javacore.string;

import java.util.Arrays;
import java.util.regex.*;



public class RegularExpressions {

	public static void main(String[] args) {
		
		
		String gmailPattern="[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p=Pattern.compile(gmailPattern);
		String sampleText = "Some random text that contains gmail addresses "
				+ "like this one some-email@gmail.com. And some other random text.";
		Matcher m=p.matcher(sampleText);
		
		m.find();
		System.out.println(m.group());
		
		String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
		String[] sentences=sampleText2.split("[\\.?!]");
		System.out.println(Arrays.toString(sentences));
		
	}

}
