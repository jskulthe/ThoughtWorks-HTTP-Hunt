package com.solution.impl;

import java.util.ArrayList;
import java.util.TreeMap;

import com.solution.Solution;
import com.solution.util.CustomJsonUtils;
import com.solution.util.HttpUtils;

public class Solution4 implements Solution {

	@Override
	public void solve() throws Exception {
		HttpUtils obj = new HttpUtils();
		CustomJsonUtils jsonUtils = new CustomJsonUtils();

		try {
			System.out.println("Testing 1 - Send Http GET request");
			String input = obj.sendGet();
			TreeMap<String, Integer> res = getVowelCount(jsonUtils.getJsonText(input));
			System.out.println("got length " + res);
			System.out.println("Testing 2 - Send Http POST request");
			String jsonStr = jsonUtils.convertMapToJson(res);
			obj.sendPost(jsonStr);

		} finally {
			obj.close();
		}

	}

	public TreeMap<String, Integer> getVowelCount(String input) {

		TreeMap<String, Integer> charCountMap = new TreeMap<String, Integer>();

		// Converting given string to char array

		char[] strArray = input.toCharArray();
		// char[] vowels = {'a','e','i','o','u'};

		ArrayList<Character> al = new ArrayList<>();

		// ArrayList<String> vl = new ArrayList<>();
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');

		// checking each char of strArray
		for (char c : strArray) {
			if (al.contains(c)) {
				String s = Character.toString(c);
				if (charCountMap.containsKey(s)) {
					// If char is present in charCountMap,
					// incrementing it's count by 1
					charCountMap.put(s, charCountMap.get(s) + 1);
				} else {

					// If char is not present in charCountMap,
					// putting this char to charCountMap with 1 as it's value
					charCountMap.put(s, 1);
				}
			}
		}

		System.out.println(charCountMap);
		return charCountMap;
	}

}
