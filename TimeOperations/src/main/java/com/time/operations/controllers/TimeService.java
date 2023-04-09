package com.time.operations.controllers;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
	
	NumberConstants numberConstant = new NumberConstants();
	
	public String getCurrentTimeInWords(int hour, int minutes) {
		String result;
		
		switch (hour-minutes) {
		case 12-0:
			result = "It's midday";
			break;
		case 24-0:
			result = "It's midnight";
			break;
		default:
			result = "It's "+ this.convertNumberToWords(hour) + " " +this.convertNumberToWords(minutes);
			break;
		}
		return result;
	}

	private String convertNumberToWords(int number) {
		String numberInWords;
		if(number / 10 > 1) {
			numberInWords = numberConstant.tensNumberToWordsMap.get(number / 10);
			if(number % 10 == 0) {
				numberInWords = numberInWords + " ";
			} else {
				numberInWords = numberInWords + " " + numberConstant.onesNumberToWordsMap.get(number % 10);
			}
		} else {
			numberInWords = numberConstant.onesNumberToWordsMap.get(number);
		}
		return numberInWords;
	}
}
