package com.solution.util;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class HttpUtils {

	private final CloseableHttpClient httpClient = HttpClients.createDefault();

	public String sendGet() throws Exception {

		HttpGet request = new HttpGet("https://http-hunt.thoughtworks-labs.net/challenge/input");

		// add request headers
		request.addHeader("userid", "GhiklI--");

		try (CloseableHttpResponse response = httpClient.execute(request)) {

			// Get HttpResponse Status
			System.out.println(response.getStatusLine().toString());

			HttpEntity entity = response.getEntity();
			Header headers = entity.getContentType();
			System.out.println(headers);

			if (entity != null) {
				// return it as a String
				String result = EntityUtils.toString(entity, "UTF-8");
				System.out.println(result);

				return result;
			}
		}

		return "";

	}

	public void sendPost(int res, String key) throws IOException {

		HttpPost post = new HttpPost("https://http-hunt.thoughtworks-labs.net/challenge/output");
		post.addHeader("userid", "GhiklI--");
		JSONObject json = new JSONObject();
		json.put(key, res);

		StringEntity params = new StringEntity(json.toString());
		post.addHeader("content-type", "application/json");
		post.setEntity(params);

		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {

			System.out.println(EntityUtils.toString(response.getEntity()));
		}

	}

	public void sendPost(String jsonMap) throws Exception {

		HttpPost post = new HttpPost("https://http-hunt.thoughtworks-labs.net/challenge/output");
		post.addHeader("userid", "GhiklI--");

		StringEntity params = new StringEntity(jsonMap);
		post.addHeader("content-type", "application/json");
		post.setEntity(params);

		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {

			System.out.println(EntityUtils.toString(response.getEntity()));
		}
	}

	public void close() throws IOException {
		httpClient.close();
	}

}
