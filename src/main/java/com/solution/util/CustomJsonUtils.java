package com.solution.util;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;

public class CustomJsonUtils {

	public String getJsonText(String input) {
		JSONObject jObj = new JSONObject(input);
		String inputtext = jObj.getString("text");
		return inputtext;
	}

	public String convertMapToJson(Map<String, Integer> elements)
			throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();

		try {
			String json = objectMapper.writeValueAsString(elements);

			return json;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
