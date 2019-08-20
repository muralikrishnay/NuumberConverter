package com.convert;

import java.util.HashMap;
import java.util.Map;

public class NumbersToWords {

	private static Map<Integer, String> numbersToWordsMap = new HashMap<Integer,String>();

	public static void main(String[] args) {

		for (int i = 0; i <= 99; i++) {
			convertToWords(i);
		}

	}

	private static void fillMap() {
		numbersToWordsMap.put(1, "One");
		numbersToWordsMap.put(2, "Two");
		numbersToWordsMap.put(3, "Three");
		numbersToWordsMap.put(4, "Four");
		numbersToWordsMap.put(5, "Five");
		numbersToWordsMap.put(6, "Six");
		numbersToWordsMap.put(7, "Seven");
		numbersToWordsMap.put(8, "Eight");
		numbersToWordsMap.put(9, "Nine");
		numbersToWordsMap.put(10, "Ten");
		numbersToWordsMap.put(11, "Eleven");
		numbersToWordsMap.put(12, "Twelve");
		numbersToWordsMap.put(13, "Thirteen");
		numbersToWordsMap.put(14, "Fourteen");
		numbersToWordsMap.put(15, "Fiveteen");
		numbersToWordsMap.put(16, "Sixteen");
		numbersToWordsMap.put(17, "Seventeen");
		numbersToWordsMap.put(18, "Eighteen");
		numbersToWordsMap.put(19, "Nineteen");
		numbersToWordsMap.put(20, "Twenty");
		numbersToWordsMap.put(30, "Thirty");
		numbersToWordsMap.put(40, "Fourty");
		numbersToWordsMap.put(50, "Fifty");
		numbersToWordsMap.put(60, "Sixty");
		numbersToWordsMap.put(70, "Seventy");
		numbersToWordsMap.put(80, "Eighty");
		numbersToWordsMap.put(90, "Ninety");
		numbersToWordsMap.put(100, "Hundred");
	}

	public static void convertToWords(Integer i) {
		fillMap();
		StringBuilder word = new StringBuilder();
		Integer k = null;
		// word = numbersToWordsMap.get(i);
		// System.out.println(i+":"+word);
		String number = i.toString();
		char[] str = number.toCharArray();
		if (str.length == 1 || i <= 20)
			word.append(numbersToWordsMap.get(i));
		else {
			for (int j = 0; j < str.length; j++) {

				if (str.length == 2 && j == 0) {
					k = new Integer(Character.toString((str[0])) + "0");

					word.append(numbersToWordsMap.get(k));
					continue;
				}
				if (new Integer(Character.toString(str[1])) == 0)
					break;

				Integer l = new Integer(Character.toString(str[j]));
				word.append(numbersToWordsMap.get(l));
			}
		}
		System.out.println(i + ":" + word);

	}
}
