package com.solution.impl;

import org.json.JSONObject;

import com.solution.Solution;
import com.solution.util.HttpUtils;

public class Solution1 implements Solution {

	@Override
	public void solve() throws Exception {
		HttpUtils obj = new HttpUtils();

		try {
			System.out.println("Testing 1 - Send Http GET request");
			String input = obj.sendGet();

			int res = getCharCount(input);
			System.out.println("got length " + res);
			System.out.println("Testing 2 - Send Http POST request");
			obj.sendPost(res,"count");

		} finally {
			obj.close();
		}

	}

	private int getCharCount(String input) {

		JSONObject jObj = new JSONObject(input);
		String inputtext = jObj.getString("text");
		return inputtext.length();
	}

}
