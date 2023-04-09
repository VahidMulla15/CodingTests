package com.time.operations.controllers;

import java.util.HashMap;
import java.util.Map;

public class NumberConstants {
	public final Map<Integer, String> onesNumberToWordsMap = new HashMap<>();
	public final Map<Integer, String> tensNumberToWordsMap = new HashMap<>();
	
	public NumberConstants(){
		this.onesNumberToWordsMap.put(0, " ");
		this.onesNumberToWordsMap.put(1, "one");
		this.onesNumberToWordsMap.put(2, "two");
		this.onesNumberToWordsMap.put(3, "three");
		this.onesNumberToWordsMap.put(4, "four");
		this.onesNumberToWordsMap.put(5, "five");
		this.onesNumberToWordsMap.put(6, "six");
		this.onesNumberToWordsMap.put(7, "seven");
		this.onesNumberToWordsMap.put(8, "eight");
		this.onesNumberToWordsMap.put(9, "nine");
		this.onesNumberToWordsMap.put(10, "ten");
		this.onesNumberToWordsMap.put(11, "eleven");
		this.onesNumberToWordsMap.put(12, "twelve");
		this.onesNumberToWordsMap.put(13, "thirteen");
		this.onesNumberToWordsMap.put(14, "forteen");
		this.onesNumberToWordsMap.put(15, "fifteen");
		this.onesNumberToWordsMap.put(16, "sixteen");
		this.onesNumberToWordsMap.put(17, "seventeen");
		this.onesNumberToWordsMap.put(18, "eighteen");
		this.onesNumberToWordsMap.put(19, "nineteen");
		this.tensNumberToWordsMap.put(0, " ");
		this.tensNumberToWordsMap.put(1, "ten");
		this.tensNumberToWordsMap.put(2, "twenty");
		this.tensNumberToWordsMap.put(3, "thirty");
		this.tensNumberToWordsMap.put(4, "forty");
		this.tensNumberToWordsMap.put(5, "fifty");
	}
}
